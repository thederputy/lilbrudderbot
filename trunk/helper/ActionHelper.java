package helper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import lejos.navigation.TachoNavigator;
import lejos.nxt.*;
import lejos.util.*;
/**
 * <p>This class is what defines how the robot moves and turns.</p>
 * @author Austin
 */
public class ActionHelper {
    public static double Translation = 20.4627783975293;
    public static int accfactor = 2;
    public static int maxretries = 3;
    public static int redfac = 6;
    private static int numActions = 0;
    public static int SecStart = 3;

    private static int destX = 1500;
    private static boolean useDest = true;

    public static IceThread chiptuner = new IceThread();


    public static TachoNavigator nav = new TachoNavigator(56, 112, Motor.C, Motor.B, false);


    public static boolean isInBase() {
        return (useDest && (nav.getX() > ActionHelper.destX));
    }
    private static void MotorST(int distc, int speedc, int distb, int speedb) {
        int udistb = (int) (distb * ActionHelper.Translation);
        int udistc = (int) (distc * ActionHelper.Translation);
        Motor.B.stop();
        Motor.C.stop();
        
        while (Motor.B.getActualSpeed() != 0 && Motor.C.getActualSpeed() != 0) {
        }

       

        Motor.B.setSpeed(speedb);
        Motor.C.setSpeed(speedc);
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();

        
        
        Motor.C.forward();
        int b = ((udistb > 0)?(1):(-1));
        int c = ((udistc > 0)?(1):(-1));
        if (b == 1) {
            Motor.B.forward();
        } else {
            Motor.B.backward();
        }
        if (c == 1) {
            Motor.C.forward();
        } else {
            Motor.C.backward();
        }
        int changecountb = 1;
        int changecountc = 1;
        while ((
                Motor.B.getTachoCount() != udistb ||
                Motor.C.getTachoCount() != udistc) &&
                (changecountb < ActionHelper.maxretries ||
                changecountc < ActionHelper.maxretries)) {
            if ((Motor.B.getTachoCount() * b) >
                    ((udistb - Motor.B.getError() ) * b)
                    - ActionHelper.accfactor) {
                if (Motor.B.getTachoCount() == udistb ||
                        changecountb > ActionHelper.maxretries - 1) {
                    Motor.B.stop();
                    changecountb = ActionHelper.maxretries + 1;
                } else {
                    b = ((udistb - Motor.B.getTachoCount() > 0)?(1):(-1));
                    changecountb++;
                    Motor.B.setSpeed(speedb /
                            (changecountb * ActionHelper.redfac));
                    if (b == 1) {
                        Motor.B.forward();
                    } else {
                        Motor.B.backward();
                    }
                }
            }
            if ((Motor.C.getTachoCount() * c) >
                    ((udistc - Motor.C.getError()) * c)
                    - ActionHelper.accfactor) {
                if (Motor.C.getTachoCount() == udistc ||
                        changecountc > ActionHelper.maxretries - 1) {
                    Motor.C.stop();
                    changecountc = ActionHelper.maxretries + 1;
                } else {
                    c = ((udistc - Motor.C.getTachoCount() > 0)?(1):(-1));
                    changecountc++;
                    Motor.C.setSpeed(speedc /
                            (changecountc * ActionHelper.redfac));
                    if (c == 1) {
                        Motor.C.forward();
                    } else {
                        Motor.C.backward();
                    }
                }
            }
            
        }
    }

    private static void MotorTN(int distc, int speedc, int distb, int speedb) {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        System.out.println("x: " + nav.getX() + " y: " + nav.getY());
        int mb = ((distb > 0)?1:-1);
        int mc = ((distc > 0)?1:-1);
        Motor.B.setSpeed(speedb);
        Motor.C.setSpeed(speedc);
        if (mb == 1) {
            Motor.B.forward();
        } else {
            Motor.B.backward();
        }
        if (mc == 1) {
            Motor.C.forward();
        } else {
            Motor.C.backward();
        }
        boolean stuck = false;
        while ((Motor.B.isMoving() || Motor.C.isMoving()) && !stuck) {
            int bc = Motor.B.getTachoCount();
            int cc = Motor.C.getTachoCount();
            stuck = ((stuck || (Math.abs(Motor.B.getActualSpeed()) == 0 && Math.abs(Motor.C.getActualSpeed()) == 0)));
            stuck = stuck && (((distb * Translation * mb) + (distc * Translation * mc)) / 4 < ((bc * mb) + (cc * mc))/2);
            if (stuck) {
                System.out.println("!!Stuck!!");
            }
            if ((bc * mb) > (distb * Translation * mb)) {
                Motor.B.stop();
            }
            if ((cc * mc) > (distc * Translation * mc)) {
                Motor.C.stop();
            }
            
            //try{Thread.sleep(10);}catch(Exception e) {}
            if (isInBase()) {
                System.out.println("IM INNA BASE LULS");
                break;
            }
        }
        Motor.B.stop();
        Motor.C.stop();
        nav.updatePosition();
        System.out.println("x: " + nav.getX() + " y: " + nav.getY());
    }

    public static void MotorSingle(int angle, int speed, Motor m) {
        m.resetTachoCount();
        int mb = ((angle > 0)?1:-1);
        m.setSpeed(speed);
        if (mb == 1) {
            m.forward();
        } else {
            m.backward();
        }
        boolean stuck = false;
        while ((m.isMoving()) && !stuck) {
            int bc = m.getTachoCount();
            stuck = ((stuck || (Math.abs(Motor.B.getActualSpeed()) == 0 && Math.abs(Motor.C.getActualSpeed()) == 0)));
            stuck = stuck && (((angle * mb)/2) < (bc * mb));
            if (stuck) {
                System.out.println("!!Stuck!!");
            }
            if ((bc * mb) > (angle * mb)) {
                m.stop();
            }

            //try{Thread.sleep(10);}catch(Exception e) {}
        }
        m.stop();
    }

    //Distance between the wheels 11.2cm
    //Radius of the wheels 2.89cm repeating of course
    //3.97580087233961 I din't know what this number is
    //70.3716754404113 The circumference of the
    //                 turning radius of the robot in cm
    /**
     * <p>This method turns the robot around a point shown in
     * <code>balance</code>.
     * @param degrees positive rotates to the left, negative to the right
     * @param speed the speed
     * @param balance 0 rotates around the right wheel, 0.5 rotates around the
     * center, and 1 rotates around the left wheel
     */
    public static void Rotate(int degrees, int speed, double balance) {
        int dist = (int) (70.3716754404113 * (degrees / 360.0));
        int distb = (int) (dist * balance);
        int distc = (int) (-dist * (1 - balance));
        int div = Math.max(Math.abs(distb), Math.abs(distc));
        int speedh = ((balance >= 0 && balance <= 1)?((speed/4)*3):((speed/16)*14));
        int speedb = Math.abs(speedh * distb / div);
        int speedc = Math.abs(speedh * distc / div);
        System.out.print("" + speedb + " ");
        System.out.println("" + speedc);
        ActionHelper.MotorGo(distc, speedc, distb, speedb);
    }

    /**
     * <p>This method turns the robot around a point shown in
     * <code>balance</code>.
     * @param degrees positive rotates to the left, negative to the right
     * @param speed the speed
     * @param balance 0 rotates around the right wheel, 0.5 rotates around the
     * center, and 1 rotates around the left wheel
     * @param debug A debug string
     */
    public static void Rotate(int degrees, int speed,
            double balance, String debug) {
        System.out.println(debug);
        ActionHelper.Rotate(degrees, speed, balance);
    }

    /**
     * Turns the robot around a point offset by a number of centimeters from
     * the middle of the robet.
     * @param degrees positive number rotates counterclockwise, negative rotates clockwise
     * @param speed the speed
     * @param center the center of the turn in centimeters offset from the center of the robet
     */
    public static void Arc(int degrees, int speed, int center) {
        ActionHelper.Rotate(degrees, speed, (5.6 + (center))/11.2);
    }

    /**
     * Turns the robot around a point offset by a number of centimeters from
     * the middle of the robet.
     * @param degrees positive number rotates counterclockwise, negative rotates clockwise
     * @param speed the speed
     * @param center the center of the turn in centimeters offset from the center of the robet
     * @param debug the debug string
     */
    public static void Arc(int degrees, int speed, int center, String debug) {
        ActionHelper.Rotate(degrees, speed, (5.6 + (center))/11.2, debug);
    }

    /**
     * The motion wrapper function
     * @param distc the distance the left wheel should go in centimeters
     * @param speedc the speed of the left wheel
     * @param distb the distance the right wheel should go in centimeters
     * @param speedb the speed of the right wheel
     */

    /**
     * <p>This version of <code>MotorGo</code> does not
     * contain a string output.</p>
     * @param distc the distance in centimetres for the left wheel to turn
     * @param speedc the speed of the left wheel
     * @param distb the distance in centimetres for the right wheel to turn
     * @param speedb the speed of the right wheel
     */
    public static void MotorGo(int distc, int speedc, int distb, int speedb) {
        //ActionHelper.Stop(); Stop seems to be making it jitter unpredictably
        //ActionHelper.MotorST(distc, speedc, distb, speedb);
        ActionHelper.MotorTN(distc, speedc, distb, speedb);
    }
    /**
     * <p>This version of <code>MotorGo</code> has a string output.</p>
     * @param distc the distance in centimetres for the left wheel to turn
     * @param speedc the speed of the left wheel
     * @param distb the distance in centimetres for the right wheel to turn
     * @param speedb the speed of the right wheel
     * @param debug the string printed on the screen
     */
    public static void MotorGo(int distc, int speedc, int distb, int speedb, String debug) {
        System.out.println(debug);
        ActionHelper.MotorGo(distc, speedc, distb, speedb);
    }
    public static void Stop() {
        ActionHelper.MotorGo(0, 300, 0, 300);
    }

    public static void Pause(int millis) {
        for (int nsec = 0; nsec < 10; nsec++) {
            System.out.println("" + (ActionHelper.SecStart - nsec) + "...");
            try{Thread.sleep(millis/10);}catch(Exception e) {}
        }
    }

    public static void Start() {
        System.out.println("x: " + nav.getX() + " y: " + nav.getY());
        for (int nsec = 0; nsec < ActionHelper.SecStart; nsec++) {
            System.out.println("" + (ActionHelper.SecStart - nsec) + "...");
            try{Thread.sleep(200);}catch(Exception e) {}
        }
        System.out.println("CHABBENGE");
        Motor.B.regulateSpeed(true);
        Motor.C.regulateSpeed(true);
        Motor.B.smoothAcceleration(true);
        Motor.C.smoothAcceleration(true);
        ActionHelper.Stop();
    }
}
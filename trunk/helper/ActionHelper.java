package helper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import lejos.nxt.*;
/**
 *
 * @author Austin
 */
public class ActionHelper {
    public static double Translation = 20.45;
    public static int accfactor = 2;
    public static int maxretries = 2;
    public static int redfac = 8;
    public static void MotorST(int distc, int speedc, int distb, int speedb) {
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
                (changecountb < ActionHelper.maxretries || changecountc < ActionHelper.maxretries)) {
            if ((Motor.B.getTachoCount() * b) >
                    ((udistb - Motor.B.getError() ) * b) - ActionHelper.accfactor) {
                if (Motor.B.getTachoCount() == udistb || changecountb > ActionHelper.maxretries - 1) {
                    Motor.B.stop();
                    changecountb = ActionHelper.maxretries + 1;
                } else {
                    b = ((udistb - Motor.B.getTachoCount() > 0)?(1):(-1));
                    System.out.println("B FAIL: " + changecountb + " DIR " + b);
                    changecountb++;
                    
                    Motor.B.setSpeed(speedb / (changecountb * ActionHelper.redfac));
                    if (b == 1) {
                        Motor.B.forward();
                    } else {
                        Motor.B.backward();
                    }
                }
            }
            if ((Motor.C.getTachoCount() * c) >
                    ((udistc - Motor.C.getError()) * c) - ActionHelper.accfactor) {
                if (Motor.C.getTachoCount() == udistc || changecountc > ActionHelper.maxretries - 1) {
                    Motor.C.stop();
                    changecountc = ActionHelper.maxretries + 1;
                } else {
                    c = ((udistc - Motor.C.getTachoCount() > 0)?(1):(-1));
                    System.out.println("C FAIL: " + changecountc + " DIR " + c);
                    changecountc++;
                    Motor.C.setSpeed(speedc / (changecountc * ActionHelper.redfac));
                    if (c == 1) {
                        Motor.C.forward();
                    } else {
                        Motor.C.backward();
                    }
                }
            }
            
        }
    }

    //11.2cm
    //3cm
    //3.97580087233961
    //70.3716754404113

    public static void Rotate(int degrees, int speed, double balance) {
        int dist = (int) (70.3716754404113 * (degrees / 360.0));
        int distb = (int) (dist * balance);
        int distc = (int) (-dist * (1 - balance));
        int div = Math.max(Math.abs(distb), Math.abs(distc));
        int speedh = ((balance >= 0 && balance <= 1)?(speed/2):(speed));
        int speedb = Math.abs(speedh * distb / div);
        int speedc = Math.abs(speedh * distc / div);
        System.out.print("" + speedb + " ");
        System.out.println("" + speedc);
        ActionHelper.MotorGo(distc, speedc, distb, speedb);
    }

    public static void MotorGo(int distc, int speedc, int distb, int speedb) {
        //ActionHelper.Stop(); Stop seems to be making it jitter unpredictably
        ActionHelper.MotorST(distc, speedc, distb, speedb);
    }

    public static void MotorGo(int distc, int speedc, int distb, int speedb, String debug) {
        System.out.println(debug);
        ActionHelper.MotorGo(distc, speedc, distb, speedb);
    }
    public static void Stop() {
        ActionHelper.MotorST(0, 600, 0, 600);
    }
}

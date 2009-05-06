/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 * <p>This class does the following things.
 *      - crosses the bridge
 *      - turns right to scoop the pizza molecules
 *      - faces the base
 *      - backs up to hit the second elevator lever
 *      - takes the pizza molecules to the Nano base
 * </p>
 * @author Jacob
 */
public class Phase6 {
    /**
     * <p>The speed of the motor when going forwards and backwards.</p>
     */
    private static final int SPEED = 500;
    /**
     * <p>This is the class for phase 6.
     * It does these things:
     *      - crosses the bridge
     *      - scoops the pizza molecules
     *      - hits the second elevator lever
     *      - goes back to the nano base
     * @param args
     */
    public static void main(String[] args) {
        ActionHelper.Stop();
        //go out from the base and cross the bridge
        ActionHelper.MotorGo(165, SPEED, 165, SPEED, "CROSSING BRIDGE");
        //turn right to face the pizza molecules
        ActionHelper.Rotate(-98, SPEED, 0.5, "");
        //go forward to scoop the pizza molecules
        ActionHelper.MotorGo(50, SPEED, 50, SPEED, "SCOOPING PIZZA");
        //turn left to face the base
        ActionHelper.Rotate(75, SPEED, 0, "FACING BASE");
        //go backwards to hit the elevator
        ActionHelper.MotorGo(-30, SPEED, -30, SPEED, "HITTING ELEVATOR");
        //go forward a bit before turning to better face the Nano base
        ActionHelper.MotorGo(5, SPEED, 5, SPEED, "GO TO NANO BASE");
        //turn a bit to face the Nano Base
        ActionHelper.Rotate(-10, SPEED, 0, "FACING BASE");
        //go to the Nano base
        ActionHelper.MotorGo(85, SPEED, 85, SPEED, "GO TO NANO BASE");
    }
    //original code
    /*
    private static int MOTOR_SPEED = 500;
    public static void main(String[] args) {
        LCD.clearDisplay();
        System.out.println("I WILL GO FROM \nTHE POWER BASE \nTO THE NANO BASE"
                + "\n WHEN YOU PRESS \nA BUTTON!");
        Button.waitForPress();
        LCD.clearDisplay();
        //cross the bridge
        System.out.println("CROSSING BRIDGE!");
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.B.setSpeed(MOTOR_SPEED);
        Motor.C.setSpeed(MOTOR_SPEED);
        Motor.B.forward();
        Motor.C.forward();
        int count = 0;
        while(count < 3310) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
        //face the pizza molecules
        turnRight();

        //scoop the pizza molecules
        LCD.clearDisplay();
        System.out.println("SCOOPING PIZZA\nMOLECULES!");
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.B.forward();
        Motor.C.forward();
        count = 0;
        while(count < 720) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();

        //face the base
        turnLeft();

        //back up to hit the elevator
        hitElevator();
        //go to the nano base
        LCD.clearDisplay();
        System.out.println("GOING TO NANO \nBASE!");
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.B.forward();
        Motor.C.forward();
        count = 0;
        while(count < 2200) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }

    private static void turnRight() {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        LCD.clearDisplay();
        System.out.println("TURNING RIGHT");
        Motor.C.forward();
        int count = 0;
        while(count < 360) {
            count = Motor.C.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }

    private static void turnLeft() {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        LCD.clearDisplay();
        System.out.println("FACING THE BASE");
        Motor.B.forward();
        int count = 0;
        while(count < 270) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }

    private static void hitElevator() {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        LCD.clearDisplay();
        System.out.println("HITTING\nELEVATOR");
        Motor.B.backward();
        Motor.C.backward();
        int count = 0;
        while(count > -720) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }
    */
}


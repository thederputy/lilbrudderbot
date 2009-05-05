/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 * <p>This class is for phase 1.
 * It does these things:
 *      - drops off the wave turbine
 *      - pushes the truck back to the base
 *      - pushes one of the sattelite levers
 *      - goes back to base.</p>
 * @author Jacob
 */
public class Phase1 {
    public static void main(String[] args) {
        /**
         * <p>The speed of the motor when going forwards and backwards.</p>
         */
        int speed = 500;
        /**
         * <p>The speed of the motor when turning.</p>
         */
        int turn = 200;
        // go out from base
        ActionHelper.MotorGo(120, speed, 20, speed, "GO OUT FROM BASE");
        //turn left
        ActionHelper.Rotate(90, turn, 0.5);
        //go towards the ocean
        ActionHelper.MotorGo(41, speed, 41, speed, "GO TOWARDS OCEAN");
        //turn right
        ActionHelper.Rotate(-90, turn, 0.5);
        //drop off the wave turbine
        ActionHelper.MotorGo(15, speed, 15, speed, "DROP OFF TURBINE");
        //back up
        ActionHelper.MotorGo(-15, speed, -15, speed, "BACKING UP");
        //turn right
        ActionHelper.Rotate(-90, turn, 0.5);

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 * <p>This class is for phase 7.
 * It does these things:
 *      - Travels to satellite on nano side
 *      - Hits the lever
 *      - Drops trees at satellite
 *      - Returns to power base with pizza (yum!).</p>
 * @author Ira
 */
public class Phase7 {
    public static void main(String[] args) {
        /**
         * <p>The speed of the motor when going forwards and backwards.</p>
         */
        int speed = 500;
        /**
         * <p>Speed of turns.</p>
         */
        int turn = 300;

        // Leaving base
        ActionHelper.MotorGo(65, speed, 65, speed, "LEAVING NANO BASE");
        // Turn right 90
        ActionHelper.Rotate(-90, turn, 0.5);
        // Forward
        ActionHelper.MotorGo(107, speed, 107, speed, "GOING TO SATELLITE");
        // Turn left
        ActionHelper.Rotate(90, turn, 0.5);
        // Pushing lever
        ActionHelper.MotorGo(25, speed, 25, speed, "PUSHING LEVER");
        // Reverse
        ActionHelper.MotorGo(-25, speed, -25, speed, "PLANTING TREES");
        // Turning left
        ActionHelper.Rotate(90, turn, 0.5);
        // Forward to ramp
        ActionHelper.MotorGo(22, speed, 22, speed, "GOING TO RAMP");
        // Turn to line up with ramp
        ActionHelper.Rotate(-90, turn, 0.5);
        // Go to power base
        ActionHelper.MotorGo(150, speed, 150, speed, "GOING TO POWER BASE");
    }
}

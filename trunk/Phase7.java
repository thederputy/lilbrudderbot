/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
import lejos.nxt.*;
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
        ActionHelper.Start();
        // Leaving base
        ActionHelper.MotorGo(55, speed, 55, speed, "LEAVING NANO BASE");
        // Turn right 90
        ActionHelper.Rotate(-90, turn, 0.5);
        // Forward
        ActionHelper.MotorGo(120, speed, 120, speed, "GOING TO SATELLITE");
        // Turn left
        ActionHelper.Rotate(95, turn, 0.5);
        // Pushing lever
        ActionHelper.MotorGo(30, speed, 30, speed, "PUSHING LEVER");
        // Reverse
        ActionHelper.MotorGo(-35, speed, -35, speed, "PLANTING TREES");
        // Turning left
        ActionHelper.Rotate(95, turn, 0.5);
        // Forward to ramp
        ActionHelper.MotorGo(25, speed, 25, speed, "GOING TO RAMP");
        // Turn right to line up with ramp
        ActionHelper.Rotate(-95, turn, 0.5);
        // Go to power base 
        ActionHelper.MotorGo(160, speed, 160, speed, "GOING TO POWER BASE");
        Button.waitForPress();
        // Hit the satellite lever
    }
}

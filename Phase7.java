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
        /**
         * <p>The speed when returning to the base after the second satellite
         * hit.</p>
         */
        int back = 800;
        // Make sure it doesn't jump
        ActionHelper.Start();
        // Leaving base
        ActionHelper.MotorGo(40, speed, 40, speed, "LEAVE BASE");
        // Turn right 90 degrees using the arc method
        ActionHelper.Arc(-90, speed, -20, "TURNING");
        // Forward
        ActionHelper.MotorGo(100, speed, 100, speed, "GOING TO SATELLITE");
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        // Turn right to go towards the second satellite lever
        ActionHelper.Rotate(-150, back, 0.5, "TURNING RIGHT");
        // Go forwards towards the second satellite lever
        ActionHelper.MotorGo(60, back, 60, back, "GOING TOWARDS SATELLITE");
        // Line up with the satellite
        ActionHelper.Rotate(-30, back, 0.5, "FACE SATELLITE");
        // Hit the satellite lever
        ActionHelper.MotorGo(35, back, 35, back, "HIT THE SATELLITE");
        // The following actions are a reverse of the going to satellite.
        ActionHelper.MotorGo(-35, back, -35, back, "GO BACK");
        ActionHelper.Rotate(30, back, 0.5, "GO BACK");
        ActionHelper.MotorGo(-60, back, -60, back, "GO BACK");
        ActionHelper.chiptuner.Victory();
    }
}

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
        ActionHelper.MotorGo(55, speed, 55, speed, "LEAVING NANO BASE");
        // Turn right 90
        ActionHelper.Rotate(-90, turn, 0.5);
        // Forward
        ActionHelper.MotorGo(118, speed, 118, speed, "GOING TO SATELLITE");
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
        // Go to power base without hitting second satellite lever
        ActionHelper.MotorGo(160, speed, 160, speed, "GOING TO POWER BASE");
        /*
        // Go to power base and hit second satellite lever
        // Go across the ramp, hit the second satellite lever, go to base
        ActionHelper.MotorGo(60, speed, 60, speed, "CROSSING BRIDGE");
        // Turn right
        ActionHelper.Rotate(-90, turn, 0.5);
        // Go forward a bit
        ActionHelper.MotorGo(20, speed, 20, speed, "FORWARD");
        // Turn right to face the satellite
        ActionHelper.Rotate(-90, turn, 0.5);
        // Go forward and hit the satellite
        ActionHelper.MotorGo(40, speed, 40, speed, "HIT SATELLITE");
        // Back away from satellite
        ActionHelper.MotorGo(-40, speed, -40, speed, "BACK UP");
        // Turn right to face the base
        ActionHelper.Rotate(-160, turn, 0.5);
        // Go to the base
        ActionHelper.MotorGo(80, speed, 80, speed, "GOING TO POWER BASE");
         */
    }
}

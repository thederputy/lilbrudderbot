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
         * <p>The speed of the motor when arcing.</p>
         */
        int speedArc = 800;
        // Move forward into parking lot
        ActionHelper.MotorGo(45, speed, 45, speed, "LEAVING THE BASE");
        // Arc turn right and move to beach
        ActionHelper.Arc(-90, speedArc, -60, "GOING TO CATCH SOME SUN");
        ActionHelper.MotorGo(7, speed, 7, speed, "DEPLOYING WAVE TURBINE");
        // Turn to line up with truck
        ActionHelper.Rotate(75, speed, 0.5);
        // Reverse to push truck
        ActionHelper.MotorGo(-100, speed, -100, speed, "PUSHING TRUCK");
        // Moving back to line with satellite
        ActionHelper.MotorGo(20, speed, 20, speed, "LINING WITH SATELLITE");
        // Turn right to line up with satellite
        ActionHelper.Rotate(120, speed, 0.5);
        // Go forward and hit satellite button
        ActionHelper.MotorGo(-50, speed, -50, speed, "HITTING SATELLITE");
        // Reverse back to truck
        ActionHelper.MotorGo(40, speed, 40, speed, "MOVING BACK TO TRUCK");
        // Turn to line up with truck
        ActionHelper.Rotate(60, speed, 0.5);
        // Push Truck
        ActionHelper.MotorGo(20, speed, 20, speed,"PUSHING THE TRUCK");
        // RETURN TO BASE
        ActionHelper.Arc(-70, speedArc, -30, "RETURN TO BASE");
    }
}

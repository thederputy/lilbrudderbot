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
 * @author Ira
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
        ActionHelper.MotorGo(83, speed, 83, speed, "LEAVING THE BASE");
        // Turn right
        ActionHelper.Rotate(-50, speed, 0.5);
        // Move to beach
        ActionHelper.MotorGo(75, speed, 75, speed, "DEPLOYING WAVE TURBINE");
        // Turn to line up with truck
        ActionHelper.Rotate(28, speed, 0.5);
        // Reverse to push truck
        ActionHelper.MotorGo(-125, speed, -125, speed, "PUSHING TRUCK");
        // Moving back to line with satellite
        ActionHelper.MotorGo(40, speed, 40, speed, "LINING WITH SATELLITE");
//        // Turn right to line up with satellite
//        ActionHelper.Rotate(120, speed, 0.5);
//        // Go forward and hit satellite button
//        ActionHelper.MotorGo(-50, speed, -50, speed, "HITTING SATELLITE");
//        // Reverse back to truck
//        ActionHelper.MotorGo(40, speed, 40, speed, "MOVING BACK TO TRUCK");
//        // Turn to line up with truck
//        ActionHelper.Rotate(60, speed, 0.5);
//        // Push Truck
//        ActionHelper.MotorGo(35, speed, 35, speed,"PUSHING THE TRUCK");
//        // RETURN TO BASE
//        ActionHelper.Arc(-80, speedArc, -30, "RETURN TO BASE");
    }
}

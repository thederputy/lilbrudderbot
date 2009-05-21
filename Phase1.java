/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import lejos.nxt.Button;
import helper.ActionHelper;
/**
 * <p>This class is for phase 1.
 * It does these things:
 *      - drops off the wave turbine
 *      - pushes the truck back to the base
 * </p>
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
        ActionHelper.chiptuner.Pacman();
        ActionHelper.Start();
        // Move forward into parking lot
        ActionHelper.MotorGo(95, speed, 95, speed, "LEAVING THE BASE");
        // Turn right
        ActionHelper.Rotate(-65, speed, 0); 
        // Move to beach
        ActionHelper.MotorGo(60, speed, 60, speed, "DEPLOYING WAVE TURBINE");
        // Turn to line up with truck
        ActionHelper.Rotate(50, speed, 0.5);
        // Reverse to push truck
        ActionHelper.MotorGo(-125, speed, -125, speed, "PUSHING TRUCK");
        // Victory swing truck into base, for the win
        ActionHelper.Rotate(-140, 899, 0.5);
    }
}

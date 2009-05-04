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
        int speed = 500;
        // go out from base
        ActionHelper.MotorGo(16, speed, 16, speed, "GO OUT FROM BASE");
        //turn left
        ActionHelper.Rotate(-90, speed, 0.5);
        //go towards the ocean
        ActionHelper.MotorGo(41, speed, 41, speed, "GO TOWARDS OCEAN");
    }
}

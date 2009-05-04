/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Jacob
 */
public class Phase1 {
    public static void main(String[] args) {
        int speed = 500;
        // go out from base
        ActionHelper.MotorGo(16, speed, 16, speed, "GO OUT FROM BASE");
        //turn left
        ActionHelper.Rotate(-90, speed, 0.5);
    }
}

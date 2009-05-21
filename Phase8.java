/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Jacob
 */
public class Phase8 {
    public static void main(String[] args) {
        int speed = 800;
        ActionHelper.Start();
        //move forward 4 cm
        //ActionHelper.MotorGo(3, speed, 3, speed);
        //turn right and leave base
        ActionHelper.Rotate(-90, speed, -2.75);
        //go towards corn
        ActionHelper.MotorGo(55, speed, 55, speed, "GO TOWARDS CORN");
        //turn towads corn and gather
        ActionHelper.Rotate(-85, speed, 0);
        ActionHelper.MotorGo(10, speed, 10, speed, "GRAB CORN");
    }
}

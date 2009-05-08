/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Austin
 */
public class Phase2 {
    public static void main(String[] args) {
        int speed = 500;
        ActionHelper.Start();
        //turn right and leave base
        ActionHelper.Rotate(-90, speed, -2.75);
        //go towards corn
        ActionHelper.MotorGo(46, speed, 46, speed, "GO TOWARDS CORN");
        //turn towads corn and gather
        ActionHelper.Rotate(-85, speed, 0);
        ActionHelper.MotorGo(17, speed, 17, speed, "GRAB CORN");

        //scoop corn and face back to cart switch
        ActionHelper.Rotate(180, speed, 0);
        //turn left
        //ActionHelper.Rotate(90, speed, 0.5);
        ActionHelper.MotorGo(-13, speed, -13, speed, "REVERSE");
        //flick lever
        ActionHelper.Rotate(-25, speed, 0.5);
        //come back from flipping
        ActionHelper.Rotate(25, speed, 0.5);
//        //scoop corn
//        ActionHelper.MotorGo(25, speed, 25, speed, "SCOOPING CORN");
//        ActionHelper.Rotate(90, speed, 1);
//
//        ActionHelper.MotorGo(25, speed, 25, speed, "GOING BACK TO BASE");
//        ActionHelper.Rotate(90, speed, 3);
//        ActionHelper.MotorGo(20, speed, 20, speed, "GOING BACK TO BASE");
    }
}

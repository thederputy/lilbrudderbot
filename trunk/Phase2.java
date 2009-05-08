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
        ActionHelper.Rotate(175, speed, 0);
        //back up to lever
        ActionHelper.MotorGo(-11, speed, -11, speed, "REVERSE");
        //flick lever
        ActionHelper.Rotate(-25, speed, 0.5);
        //head toward Uranium
        ActionHelper.MotorGo(62, speed, 62, speed, "SCOOPING CORN");
        //scoop Uranium and point toward base
        ActionHelper.Rotate(120, speed, .5);
//
//        ActionHelper.MotorGo(25, speed, 25, speed, "GOING BACK TO BASE");
//        ActionHelper.Rotate(90, speed, 3);
//        ActionHelper.MotorGo(20, speed, 20, speed, "GOING BACK TO BASE");
    }
}

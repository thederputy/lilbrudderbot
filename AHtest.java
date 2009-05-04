/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Austin
 */
public class AHtest {
    public static void main(String[] args) {
        int speed = 500;
        //turn right and leave base
        ActionHelper.Rotate(-90, speed, -2.77);
        //go towards corn
        ActionHelper.MotorGo(50, speed, 50, speed, "GO TOWARDS CORN");
//        //turn left
//        ActionHelper.Rotate(90, speed, 0.5);
//        ActionHelper.MotorGo(-15, speed, -15, speed, "REVERSE");
//        //flick lever
//        ActionHelper.Rotate(-25, speed, 0.5);
//        //come back from flipping
//        ActionHelper.Rotate(25, speed, 0.5);
//        //scoop corn
//        ActionHelper.MotorGo(25, speed, 25, speed, "SCOOPING CORN");
//        ActionHelper.Rotate(90, speed, 1);
//
//        ActionHelper.MotorGo(25, speed, 25, speed, "GOING BACK TO BASE");
//        ActionHelper.Rotate(90, speed, 3);
//        ActionHelper.MotorGo(20, speed, 20, speed, "GOING BACK TO BASE");
    }
}

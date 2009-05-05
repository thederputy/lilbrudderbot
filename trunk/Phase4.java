/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Cake Zombi
 */
public class Phase4 {
    public static void main(String[] args) {
        int speed = 400;
        //pick up dam and leave base
        ActionHelper.MotorGo(-20, speed, -20, speed, "GRABBIN' THE DAM!");
        //turn toward dam
        ActionHelper.Rotate(-45, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-48, speed, -48, speed, "PLACING THE DAM");
        /*ActionHelper.Rotate(-70, speed, 0);
        ActionHelper.MotorGo(10, speed, 10, speed, "GRAB CORN");
        ActionHelper.Rotate(90 + 70, speed, 0.2);
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
//        ActionHelper.MotorGo(20, speed, 20, speed, "GOING BACK TO BASE");*/
    }


}

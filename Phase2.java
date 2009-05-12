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
        int retspeed = 800;
        ActionHelper.Start();
        //move forward 4 cm
        ActionHelper.MotorGo(4, speed, 4, speed);
        //turn right and leave base
        ActionHelper.Rotate(-90, speed, -2.75);
        //go towards corn
        ActionHelper.MotorGo(53, speed, 53, speed, "GO TOWARDS CORN");
        //turn towads corn and gather
        ActionHelper.Rotate(-85, speed, 0);
        ActionHelper.MotorGo(10, speed, 10, speed, "GRAB CORN");

        //scoop corn and face back to cart switch
        ActionHelper.Rotate(195, speed, .0);
        //back up to lever
        ActionHelper.MotorGo(-10, speed, -10, speed, "BASH THE SWITCH!");
        //flick lever
        ActionHelper.Rotate(-25, speed, 0.5);
        //head toward Uranium
        /*ActionHelper.MotorGo(64, speed, 64, speed, "SCOOPING URANIUM");
        //scoop Uranium and point toward base
        ActionHelper.Rotate(150, 200, .5);
        //return to base
        ActionHelper.MotorGo(120, retspeed, 120, retspeed, "RETURNING TO BASE");
        */
    }
}

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
        //ActionHelper.chiptuner.start();
        ActionHelper.Start();
        //move forward 4 cm
        ActionHelper.MotorGo(3, speed, 3, speed);
        //turn right and leave base
        ActionHelper.Rotate(-90, speed, -2.75);
        //go towards corn
        ActionHelper.MotorGo(55, speed, 55, speed, "GO TOWARDS CORN");
        //turn towads corn and gather
        ActionHelper.Rotate(-85, speed, 0);
        ActionHelper.MotorGo(10, speed, 10, speed, "GRAB CORN");

        //scoop corn and face back to cart switch
        ActionHelper.Rotate(195, speed, 0);
        //back up to lever
        ActionHelper.MotorGo(-7, speed, -7, speed, "BASH THE SWITCH!");
        //flick lever
        ActionHelper.Rotate(-30, speed, 0);
        //head toward Uranium
        ActionHelper.MotorGo(58, speed, 58, speed, "SCOOPING URANIUM");
        //scoop Uranium and point toward base
       ActionHelper.Rotate(140, 200, 0);
        //return to base
       ActionHelper.MotorGo(115, speed, 115, speed, "RETURNING TO BASE");
        //throw corn at the wall
       ActionHelper.Rotate(180, retspeed, 0.5);
    }
}

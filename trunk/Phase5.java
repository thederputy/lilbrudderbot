/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Cake Zombi
 */
public class Phase5 {
    
    public static void main(String[] args) {
        int speed = 500;
        int retspeed = 650;
        ActionHelper.Start();
        //pick up power lines and leave base
        ActionHelper.MotorGo(-40, speed, -40, speed, "GRABBIN' THE POWER LINES");
        //push power lines
        ActionHelper.Rotate(-30, speed, 2.5);
        //go towards power plant
        ActionHelper.MotorGo(-20, speed, -20, speed, "PLACING THE POWER LINES");
        //go home
        ActionHelper.MotorGo(20, retspeed, 20, retspeed, "GOIN' HOME");
        ActionHelper.Rotate(30, retspeed, 2.5);
        ActionHelper.MotorGo(40, retspeed, 40, retspeed, "GOIN' HOME");
    }
}




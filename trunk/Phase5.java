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
        int retspeed = 600;
        //pick up dam and leave base
        ActionHelper.MotorGo(-64, speed, -64, speed, "GRABBIN' THE POWER LINES");
        //turn toward dam
        ActionHelper.Rotate(-30, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-10, speed, -10, speed, "PLACING THE POWER LINES");
        //go home
        ActionHelper.MotorGo(10, retspeed, 10, speed, "GOIN' HOME");
        ActionHelper.Rotate(30, retspeed, 2.5);
        ActionHelper.MotorGo(64, retspeed, 64, speed, "GOIN' HOME");
    }
}




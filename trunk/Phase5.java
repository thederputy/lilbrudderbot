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
        int retspeed = 800;
        //pick up dam and leave base
        ActionHelper.MotorGo(-20, speed, -20, speed, "GRABBIN' THE POWER LINES");
        //turn toward dam
        ActionHelper.Rotate(-30, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-50, speed, -50, speed, "PLACING THE POWER LINES");
        //go home
        ActionHelper.MotorGo(50, retspeed, 50, speed, "GOIN' HOME");
        ActionHelper.Rotate(30, retspeed, 2.5);
        ActionHelper.MotorGo(20, retspeed, 20, speed, "GOIN' HOME");
    }
}




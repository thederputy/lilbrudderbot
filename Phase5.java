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
        ActionHelper.MotorGo(-40, speed, -40, speed, "GRABBIN' THE POWER LINES");
        //turn toward dam
        ActionHelper.Rotate(-40, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-27, speed, -27, speed, "PLACING THE POWER LINES");
        //go home
        ActionHelper.MotorGo(27, retspeed, 27, speed, "GOIN' HOME");
        ActionHelper.Rotate(40, retspeed, 2.5);
        ActionHelper.MotorGo(40, retspeed, 40, speed, "GOIN' HOME");
    }
}




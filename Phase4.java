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
        int speed = 500;
        int retspeed = 700;
        //pick up dam and leave base
        ActionHelper.MotorGo(-20, speed, -20, speed, "GRABBIN' THE DAM!");
        //turn toward dam
        ActionHelper.Rotate(-70, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-40, speed, -40, speed, "PLACING THE DAM");
        //retun to base
        ActionHelper.MotorGo(40, retspeed, 40, speed, "RETURNING TO BASE");

        ActionHelper.Rotate(70, retspeed, 2.5);

        ActionHelper.MotorGo(20, retspeed, 20, speed, "RETURNING TO BASE");
        
    }

}

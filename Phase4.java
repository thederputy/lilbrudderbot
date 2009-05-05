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
        int retspeed = 600;
        //pick up dam and leave base
        ActionHelper.MotorGo(-23, speed, -23, speed, "GRABBIN' THE DAM!");
        //turn toward dam
        ActionHelper.Rotate(-68, speed, 2.5);
        //go towards river
        ActionHelper.MotorGo(-42, speed, -42, speed, "PLACING THE DAM");
        //retun to base
        ActionHelper.MotorGo(42, retspeed, 42, speed, "RETURNING TO BASE");

        ActionHelper.Rotate(68, retspeed, 2.5);

        ActionHelper.MotorGo(23, retspeed, 23, speed, "RETURNING TO BASE");
        
    }

}

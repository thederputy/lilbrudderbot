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
        int retspeed = 650;
        ActionHelper.Start();
        //pick up dam and leave base
        ActionHelper.MotorGo(-20, speed, -20, speed, "GRABBIN' THE DAM!");
        //turn toward dam
        ActionHelper.Rotate(-75, speed, 2);
        //go towards river
        ActionHelper.MotorGo(-43, speed, -43, speed, "PLACING THE DAM");
        //retun to base
        ActionHelper.MotorGo(40, retspeed, 40, retspeed, "RETURNING TO BASE");

        ActionHelper.Rotate(75, retspeed, 2);

        ActionHelper.MotorGo(20, retspeed, 20, retspeed, "RETURNING TO BASE");
        
    }

}

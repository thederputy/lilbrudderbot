
import helper.ActionHelper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruce
 */
public class Phase3 {
    public static void main(String[] args) {
    int speed = 500;
    //Initially traveling toward oil rig
    ActionHelper.MotorGo(40, speed, 40, speed, "Heading to Oil Rig");
    //Speeding up breifly to ready hammer release
    speed = 550;
    ActionHelper.MotorGo(5, speed, 5, speed, "Speeding Up");
    //Stopping and waiting for oil barrels
    ActionHelper.MotorGo(1, 1, 1, 1, "Waiting");
    //Returning to base
    speed = 500;
    ActionHelper.MotorGo(-45, speed, -45, speed, "Returning");
    }
}

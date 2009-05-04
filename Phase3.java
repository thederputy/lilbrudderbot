
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
    ActionHelper.MotorGo(45, speed, 45, speed, "Heading to Oil Rig");
    //Stopping and waiting for oil barrels
    ActionHelper.MotorGo(1, 1, 1, 1, "Waiting");
    //Returning to base
    ActionHelper.MotorGo(-45, speed, -45, speed, "Returning");
    }
}

import lejos.nxt.*;
import helper.ActionHelper;

/*
 * The program will complete phase 3 of the challenge, it will go up to the oil
 * barrel, wait and retreive the barrels, then return to base.
 */

/**
 *
 * @author Bruce
 */
public class Phase3 {
    public static void main(String[] args) {
    int speed = 500;
    ActionHelper.Start();
    //Initially traveling toward oil rig
    ActionHelper.MotorGo(120, speed, 120, speed, "Heading to Oil Rig");
    //Hit oil barrels
    ActionHelper.MotorSingle(300, 500, Motor.A);
    //Stopping and waiting for oil barrels
    try{Thread.sleep(750);}catch(Exception e) {}
    //Returning to base
    ActionHelper.MotorGo(-120, speed, -120, speed, "Returning");
    }
}


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
    int speed = 400;
    ActionHelper.Start();
    //Initially traveling toward oil rig
    ActionHelper.MotorGo(125, speed, 125, speed, "Heading to Oil Rig");
    //Stopping and waiting for oil barrels
    try{Thread.sleep(1000);}catch(Exception e) {}
    //Returning to base
    ActionHelper.MotorGo(-125, speed, -125, speed, "Returning");
    }
}

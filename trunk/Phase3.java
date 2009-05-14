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
    int armSpeed = 300;
    int armDown = 150;
    ActionHelper.MotorSingle(-90, armSpeed, Motor.A);
    Motor.A.lock(900);
    ActionHelper.Start();
    //Initially traveling toward oil rig
    ActionHelper.MotorGo(120, speed, 120, speed, "Heading to Oil Rig");
    //Hit oil barrels
    ActionHelper.MotorSingle(50, armDown, Motor.A);
    try{Thread.sleep(1250);}catch(Exception e) {}
    ActionHelper.MotorSingle(-80, armSpeed, Motor.A);
    Motor.A.lock(900);
    //Stopping and waiting for oil barrels
    try{Thread.sleep(750);}catch(Exception e) {}
    //Returning to base
    ActionHelper.MotorGo(-120, speed, -120, speed, "Returning");
    }
}

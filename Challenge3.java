/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import lejos.nxt.*;
import helper.ActionHelper;

/**
 *
 * @author Cake Zombi
 */
public class Challenge3 {
    UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);
    TouchSensor Touch = new TouchSensor(SensorPort.S2);
    LightSensor light = new LightSensor(SensorPort.S3, false);
    public static int state = 0;

    public boolean buttonPressed() {
      return Touch.isPressed();
    }

    public static void foundWall() {
        if (Challenge3.state == 0) {
            Challenge3.state = 1;
        }
    }

    public static void inBase() {
        if (Challenge3.state == 1) {
            Challenge3.state = 2;
        }
    }

    public void onWall(boolean buttonPressed){
        if (buttonPressed){
            Motor.A.setSpeed(500);
            Motor.B.setSpeed(500);
            Motor.A.forward();
            Motor.B.forward();
            if (sonic.getDistance() == 2){
                ActionHelper.Rotate(90, 500, 1);
            }
        }
        else{
            ActionHelper.Rotate(-90,500, 0.5);
        }
    }

    public static void main(String[] args) {
        while (Challenge3.state == 0) {
            // seeking wall behavior
            FindWall.TrackWall();
        }

        while (Challenge3.state == 1) {
            // on wall behavior
            
            if (ActionHelper.isInBase()) {
                inBase();
            }
        }

        //in base
    }

}

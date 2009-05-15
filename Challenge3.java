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
    TouchSensor leftTouch = new TouchSensor(SensorPort.S2);
    LightSensor light = new LightSensor(SensorPort.S3);
    public static int state = 0;

    public boolean buttonPressed() {
      return leftTouch.isPressed();
    }

    public void onWall(boolean buttonPressed){
        if (buttonPressed){
            Motor.A.forward();
            Motor.B.forward();
            if ()
        }
        else {

        }
    }

    


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
/**
 *
 * @author Austin
 */
public class FindWall {
    private static int threshold = 35;
    private static LightSensor lt = new LightSensor(SensorPort.S3, false);
    private static TouchSensor tc = new TouchSensor(SensorPort.S2);
    private static UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
    public static void TrackWall() {
        ActionHelper.Arc((int)(Math.random() * 360), 300, 0);
        int dist = (int)(Math.random() * 10) + 20;
        ActionHelper.MotorGo(dist, 500, dist, 500);
        if (us.getDistance() < 10) {
            ActionHelper.MotorGo(20, 500, dist, 500);
            ActionHelper.Arc(90, 300, 0);
            if (lt.readValue() < threshold) {
                Challenge3.foundWall();
            }
        }
    }
}

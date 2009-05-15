/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import lejos.nxt.*;
/**
 *
 * @author Jacob
 */
public class LightTest {
    private static LightSensor light;
    private static TouchSensor touch;
    private static void main(String[] args) {
        light = new LightSensor(SensorPort.S4, false);
        touch = new TouchSensor(SensorPort.S3);
        //Button.waitForPress();
        while( !touch.isPressed() ) {
            System.out.println("" + light.readValue());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            //LCD.clearDisplay();
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import lejos.nxt.*;
/**
 *
 * @author Austin
 */
public class Fan {
    public static void main(String[] args) {
        Motor.A.setPower(5000);
        Motor.A.forward();
        Button.waitForPress();
    }
}

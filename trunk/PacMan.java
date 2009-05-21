/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
import lejos.nxt.Button;
/**
 *
 * @author Jacob
 */
public class PacMan {
    public static void main(String[] args) {
        System.out.println("Li'l Brudder\nwants you to\npress a button!");
        Button.waitForPress();
        ActionHelper.chiptuner.Pacman();
    }
}

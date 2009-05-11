
import helper.ActionHelper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austin
 */
public class Arc {
    public static void main(String[] args) {
        int speed = 500;
        ActionHelper.Start();
        ActionHelper.chiptuner.start();
        ActionHelper.Arc(360, speed, 15, "COUNTERCLOCK");
        ActionHelper.Arc(-360, speed, -15, "DOUBLOONS");
    }
}

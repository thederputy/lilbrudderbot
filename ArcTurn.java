/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 *
 * @author Austin
 */
public class ArcTurn {
    public static void main(String[] args) {
        int speed = 500;
        int speed2 = 200;
        //go out from base
        ActionHelper.MotorGo(200, speed2, 500, speed, "GO OUT FROM BASE");

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import helper.ActionHelper;
/**
 * <p>This class does the following things.
 *      - crosses the bridge
 *      - turns right to scoop the pizza molecules
 *      - faces the base
 *      - backs up to hit the second elevator lever
 *      - takes the pizza molecules to the Nano base
 * </p>
 * @author Jacob
 */
public class Phase6 {
    /**
     * <p>The speed of the motor when going forwards and backwards.</p>
     */
    private static final int SPEED = 500;
    /**
     * <p>This is the class for phase 6.
     * It does these things:
     *      - crosses the bridge
     *      - scoops the pizza molecules
     *      - hits the second elevator lever
     *      - goes back to the nano base
     * @param args
     */
    public static void main(String[] args) {
        ActionHelper.Stop();
        //go out from the base and cross the bridge
        ActionHelper.MotorGo(165, SPEED, 165, SPEED, "CROSSING BRIDGE");
        //turn right to face the pizza molecules
        ActionHelper.Rotate(-98, SPEED, 0.5, "");
        //go forward to scoop the pizza molecules
        ActionHelper.MotorGo(50, SPEED, 50, SPEED, "SCOOPING PIZZA");
        //turn left to hit the elevator
        ActionHelper.Rotate(65, SPEED, 0, "TURNING TO HIT\n ELEVATOR");
        //go backwards to hit the elevator
        ActionHelper.MotorGo(-30, SPEED, -30, SPEED, "HITTING ELEVATOR");
        //turn right a bit to face the Nano Base
        ActionHelper.Rotate(-20, SPEED, 0, "FACING BASE");
        //go to the Nano base
        ActionHelper.MotorGo(85, SPEED, 85, SPEED, "GO TO NANO BASE");
    }
}


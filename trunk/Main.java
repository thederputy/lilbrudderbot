/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import lejos.nxt.Button;
/**
 *
 * @author Austin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("P1");
        Button.waitForPress();
        Phase1.main(args);
        System.out.println("P2");
        Button.waitForPress();
        Phase2.main(args);
        System.out.println("P3");
        Button.waitForPress();
        Phase3.main(args);
        //System.out.println("P4");
        //Button.waitForPress();
        //Phase4.main(args);
        System.out.println("P5");
        Button.waitForPress();
        Phase5.main(args);
        System.out.println("P6");
        Button.waitForPress();
        Phase6.main(args);
        System.out.println("P7");
        Button.waitForPress();
        Phase7.main(args);
    }
}

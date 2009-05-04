package powerNano;

import lejos.nxt.*;

public class PowerNano {
    
    public static void main(String[] args) {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.B.forward();
        Motor.C.forward();
        int count = 0;
        while(count < 360) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
        
        turnRight();
        
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.B.forward();
        Motor.C.forward();
        count = 0;
        while(count < 540) {
            count = Motor.B.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }
    
    private static void turnRight() {
        Motor.B.resetTachoCount();
        Motor.C.resetTachoCount();
        Motor.C.forward();
        int count = 0;
        while(count < 190) {
            count = Motor.C.getTachoCount();
        }
        Motor.B.stop();
        Motor.C.stop();
    }
}

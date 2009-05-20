/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import lejos.nxt.Sound;

/**
 *
 * @author Austin
 */
public class IceThread extends Thread {
    private int[] chiptune = {
    147,40, 0,13, 147,40, 0,13, 147,40, 0,13, 117,27, 0,13, 175,13, 147,40,
    0,13, 117,27, 0,13, 175,13, 147,80, 0,27, 220,40, 0,13, 220,40, 0,13,
    220,40, 0,13, 233,27, 0,13, 175,13, 139,40, 0,13, 117,27, 0,13, 175,13,
    147,80, 0,27, 294,40, 0,13, 147,27, 0,13, 147,13, 294,27, 0,27, 277,27,
    0,13, 262,13, 247,13, 233,13, 247,27, 0,27, 156,13, 0,13, 208,27, 0,27,
    196,27, 0,13, 185,13, 175,13, 165,13, 175,27, 0,27, 117,13, 0,13, 139,27,
    0,27, 117,27, 0,13, 139,13, 175,40, 0,13, 147,27, 0,13, 175,13, 220,80,
    0,27, 294,40, 0,13, 147,27, 0,13, 147,13, 294,27, 0,27, 277,27, 0,13,
    262,13, 247,13, 233,13, 247,27, 0,27, 156,13, 0,13, 208,27, 0,27, 196,27,
    0,13, 185,13, 175,13, 165,13, 175,27, 0,27, 117,13, 0,13, 139,27, 0,27,
    117,27, 0,13, 175,13, 147,40, 0,13, 117,27, 0,13, 175,13, 147,80, };

    private int[] victory = {
    0,92, 165,1, 65,12, 0,2, 165,1, 65,12, 0,2, 65,13, 0,2, 65,42,
    0,2, 52,43, 0,2, 175,1, 58,43, 0,2, 65,13, 0,17, 58,12, 0,2,
    175,1, 65,134, };
    private double pitch = 1;
    public IceThread() {
        
    }

    public void setChipTune(int[] chip) {
        chiptune = chip;
    }

    public void run() {
        playTune();
    }

    public void playTune() {
        Sound.setVolume(100);
        for (int i = 0; i < chiptune.length; i += 2) {
            final int w = chiptune[i+1];
            final int n = chiptune[i];
            if (n != 0) Sound.playTone((int)(n*pitch), w*10);
            try { Thread.sleep(w*10); } catch (InterruptedException e) {}
        }
    }

    public void Victory() {
        setChipTune(victory);
        setPitch(8);
        this.start();
    }

    public void setPitch(double scale) {
        pitch = scale;
    }
}

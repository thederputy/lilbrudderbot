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
    2349,115, 0,5, 1760,165, 0,35, 1760,28, 0,13, 1976,23,
    0,18, 1760,18, 0,23, 1568,15, 0,25, 1480,103, 0,18, 1175,180, 0,20, 1760,18,
    0,23, 1976,20, 0,20, 1760,15, 0,25, 1568,15, 0,25, 2217,98, 0,23, 1760,88,
    0,33, 1760,75, 0,5, 1760,20, 0,20, 1760,20, 0,20, 1976,18, 0,23, 1760,18,
    0,23, 2217,225, 0,15, 2217,218};
    public IceThread() {
        
    }

    public void setChipTune(int[] chip) {
        chiptune = chip;
    }

    public void run() {
        playTune();
    }

    public void playTune() {
        for (int i = 0; i < chiptune.length; i += 2) {
            final int w = chiptune[i+1];
            final int n = chiptune[i];
            if (n != 0) Sound.playTone(n, w*10);
            try { Thread.sleep(w*10); } catch (InterruptedException e) {}
        }
    }
}

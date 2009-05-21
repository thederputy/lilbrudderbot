/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import lejos.nxt.Sound;

/**
 * For playing music.
 * Was originally going to play the ice cream truck song but it is hard to find a midi of.
 * @author Austin
 */
public class IceThread extends Thread {
    /**
     * The imperial march
     */
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

    /**
     * Final Fantasy victory music.
     */
    private int[] victory = {
    0,92, 165,1, 65,12, 0,2, 165,1, 65,12, 0,2, 65,13, 0,2, 65,42,
    0,2, 52,43, 0,2, 175,1, 58,43, 0,2, 65,13, 0,17, 58,12, 0,2,
    175,1, 65,134, };

    /**
     * The pacman startup song.
     */
    private int[] pacman = {
    247,7, 0,7, 494,7, 0,7, 370,7, 0,7, 311,7, 0,7, 494,7, 370,7,
    0,14, 311,21, 0,7, 262,7, 0,7, 523,7, 0,7, 392,7, 0,7, 330,7,
    0,7, 523,7, 392,7, 0,14, 330,21, 0,7, 247,7, 0,7, 494,7, 0,7,
    370,7, 0,7, 311,7, 0,7, 494,7, 370,7, 0,14, 311,21, 0,7, 311,7,
    330,7, 349,7, 0,7, 349,7, 370,7, 392,7, 0,7, 392,7, 415,7, 440,7,
    0,7, 494,14, };
    /**
     * The amount to modify the pitch by.
     */
    private double pitch = 1;

    /**
     * No argument constructor.
     */
    public IceThread() {
        
    }

    /**
     * Sets which song to play.
     * @param chip the chiptune to use
     */
    public void setChipTune(int[] chip) {
        chiptune = chip;
    }

    /**
     * The main thread run method.
     */
    public void run() {
        playTune();
    }

    /**
     * The method that plays the selected chiptune.
     */
    public void playTune() {
        Sound.setVolume(100);
        for (int i = 0; i < chiptune.length; i += 2) {
            final int w = chiptune[i+1];
            final int n = chiptune[i];
            if (n != 0) Sound.playTone((int)(n*pitch), w*10);
            try { Thread.sleep(w*10); } catch (InterruptedException e) {}
        }
    }

    /**
     * Helper to play the final fantasy victory music.
     */
    public void Victory() {
        setChipTune(victory);
        setPitch(8);
        this.start();
    }

    /**
     * Helper to play the pacman song.
     */
    public void Pacman() {
        setChipTune(pacman);
        setPitch(1.6);
        this.start();
    }

    /**
     * Adjusts the pitch of an entire clip.
     * @param scale the new pitch scale
     */
    public void setPitch(double scale) {
        pitch = scale;
    }
}

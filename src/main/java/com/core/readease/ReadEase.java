/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.core.readease;

import Utilities.MusicPlayer;

/**
 * @author Marc
 */
public class ReadEase {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic("Audio/Background Music/POU FREE-FALL.mp3");
        new StartingPage().setVisible(true);
    }
}
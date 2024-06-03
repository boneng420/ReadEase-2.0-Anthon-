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
        new StartingPage().setVisible(true);
        MusicPlayer musicPlayer = MusicPlayer.getInstance();
        musicPlayer.playMusic("Audio/Bach.mp3");
    }
}
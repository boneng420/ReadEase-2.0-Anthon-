package Utilities;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class MusicPlayer {
    private static MusicPlayer instance = null;
    private MediaPlayer mediaPlayer;

    private MusicPlayer() {
        // Initialize JavaFX
        new JFXPanel();
    }

    public static MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }
        return instance;
    }

    public void playMusic(String musicFile) {
        // Get the URL of the audio file
        URL musicUrl = getClass().getClassLoader().getResource(musicFile);
        if (musicUrl == null) {
            System.err.println("Cannot find audio file: " + musicFile);
            return;
        }

        // Create a Media object
        String musicUrlStr = musicUrl.toExternalForm();
        Media media = new Media(musicUrlStr);

        // Create a MediaPlayer object and pass the Media object
        this.mediaPlayer = new MediaPlayer(media); // Assign to class-level variable

        // Set the MediaPlayer to loop indefinitely
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

        // Play the audio
        mediaPlayer.play();
    }

    public void pauseMusic() {
        // Pause the audio
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            System.out.println("Music paused");
        } else {
            System.out.println("Cannot pause music: mediaPlayer is null");
        }
    }

    public void resumeMusic() {
        // Resume the audio
        if (mediaPlayer != null) {
            mediaPlayer.play();
            System.out.println("Music resumed");
        } else {
            System.out.println("Cannot resume music: mediaPlayer is null");
        }
    }
}
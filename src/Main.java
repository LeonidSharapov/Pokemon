import game.MyFrame;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        new MyFrame();
        System.out.println("░█▀▀▄░░░░░░░░░░░▄▀▀█\n" +
                "░█░░░▀▄░▄▄▄▄▄░▄▀░░░█\n" +
                "░░▀▄░░░▀░░░░░▀░░░▄▀\n" +
                "░░░░▌░▄▄░░░▄▄░▐▀▀\n" +
                "░░░▐░░█▄░░░▄█░░▌▄▄▀▀▀▀█\n" +
                "░░░▌▄▄▀▀░▄░▀▀▄▄▐░░░░░░█\n" +
                "▄▀▀▐▀▀░▄▄▄▄▄░▀▀▌▄▄▄░░░█\n" +
                "█░░░▀▄░█░░░█░▄▀░░░░█▀▀▀\n" +
                "░▀▄░░▀░░▀▀▀░░▀░░░▄█▀\n" +
                "░░░█░░░░░░░░░░░▄▀▄░▀▄\n" +
                "░░░█░░░░░░░░░▄▀█░░█░░█\n" +
                "░░░█░░░░░░░░░░░█▄█░░▄▀\n" +
                "░░░█░░░░░░░░░░░████▀\n" +
                "░░░▀▄▄▀▀▄▄▀▀▄▄▄█▀");
        System.out.println("Hey hey let's go! ゲームをする");
    }
}

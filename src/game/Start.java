package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

class Start extends JPanel {
    protected Start(){
        this.setLayout(null);
        this.setSize(1280,720);
        this.setVisible(true);
    }
    public void paintComponent (Graphics g){
        Image im = null;
        try {
            im = ImageIO.read(new File("pokemon_icon\\1.jpg"));
        } catch (IOException ignored) {
        }
        g.drawImage(im, 0, 0, null);
    }
}


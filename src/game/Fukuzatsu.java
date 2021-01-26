package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

class Fukuzatsu extends JPanel {
  protected   Fukuzatsu(){
        super.setLayout(null);
        super.setSize(1280,780);
        super.setVisible(false);
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
package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

  class Buttons extends JButton {
   protected Buttons(){
       this.setSize(new Dimension(72,72));
        this.setBackground(new Color(new Random().nextInt(200),new Random().nextInt(200),
                new Random().nextInt(200)));
        this.setFocusable(false);

    }
}

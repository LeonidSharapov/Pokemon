package game;

import javax.sound.sampled.*;
import javax.swing.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Ongaku extends JLayeredPane{

   protected Ongaku() throws IOException, LineUnavailableException, UnsupportedAudioFileException {

       this.setVisible(false);
       try {
           this.setBounds(1170, 10, 72, 72);
           this.setOpaque(false);
           File tf = new File("nanana.wav");
           AudioInputStream ais = AudioSystem.getAudioInputStream(tf);
           Clip clip = AudioSystem.getClip();
           clip.open(ais);
           clip.setFramePosition(1);
           clip.start();
           clip.loop(clip.LOOP_CONTINUOUSLY);
           JButton b1 = new JButton();
           b1.setIcon(new ImageIcon("pokemon_icon\\on.png"));
           b1.setBounds(20, 20, 48, 48);
           b1.setContentAreaFilled(false);
           b1.setBorderPainted(false);
           b1.setFocusable(false);
           super.add(b1);
           JButton b2 = new JButton();
           b2.setIcon(new ImageIcon("pokemon_icon\\off.png"));
           b2.setBounds(20, 20, 48, 48);
           b2.setContentAreaFilled(false);
           b2.setBorderPainted(false);
           b2.setFocusable(false);
           b2.setVisible(false);
           super.add(b2);
           b1.addActionListener(e -> {
               FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
               volume.setValue(-80);
               b1.setVisible(false);
               b2.setVisible(true);
           });
           b2.addActionListener(e -> {
               FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
               volume.setValue(1);
               b1.setVisible(true);
               b2.setVisible(false);
           });
           super.setVisible(true);
       }catch (ExceptionInInitializerError | FileNotFoundException ignored){

       }
   }
}

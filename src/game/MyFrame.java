package game;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyFrame extends JFrame {
    Start panel = new Start();
   protected static Fukuzatsu fkz = new Fukuzatsu();
   protected static OvariPanel end  = new OvariPanel();
   protected static   EasyPanel ep = new EasyPanel();
   protected static NormalPanel np = new NormalPanel();
   protected static HardPanel hp = new HardPanel();
   protected static VeryHardPanel vhp= new VeryHardPanel();
   protected static ImpossiblePanel imp = new ImpossiblePanel();


    public MyFrame() throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {

       Ongaku ongaku = new Ongaku();

        JButton ease = new JButton("EASY");
        JButton star= new JButton("START");
        JButton normal = new JButton("NORMAL");
        JButton hard = new JButton("HARD");
        JButton veryhard = new JButton("VERY HARD");
        JButton impossible = new JButton("IMPOSSIBLE");
        star.setFocusable(false);

        star.setBounds(520,450,165,50);
        star.setFont(new Font("start",Font.PLAIN,20));
        ease.setBounds(520,200,165,50);
        ease.setFont(new Font("easy",Font.PLAIN,20));
        ease.setFocusable(false);
        normal.setBounds(520,280,165,50);
        normal.setFont(new Font("normal",Font.PLAIN,20));
        normal.setFocusable(false);
        hard.setBounds(520,360,165,50);
        hard.setFont(new Font("hard",Font.PLAIN,20));
        hard.setFocusable(false);
        veryhard.setBounds(520,440,165,50);
        veryhard.setFont(new Font("very hard",Font.PLAIN,20));
        veryhard.setFocusable(false);
        impossible.setBounds(520,520,165,50);
        impossible.setFont(new Font("impossible",Font.PLAIN,20));
        impossible.setFocusable(false);
        panel.add(star);
        fkz.add(ease);
        fkz.add(normal);
        fkz.add(hard);
        fkz.add(veryhard);
        fkz.add(impossible);
        this.add(panel);
        this.add(end);
        star.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.this.remove(panel);
                MyFrame.this.add(fkz);
                fkz.setVisible(true);

            }
        });
        ease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fkz.setVisible(false);
               ep = new EasyPanel();
                MyFrame.this.remove(ep);
                MyFrame.this.add(ep);
                ep.add(ongaku);
                ep.setVisible(true);

            }
        });
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fkz.setVisible(false);
                np = new  NormalPanel();
                MyFrame.this.remove(np);
                MyFrame.this.add(np);
                np.add(ongaku);
                np.setVisible(true);
                np.repaint();

            }
        });
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fkz.setVisible(false);
                 hp = new HardPanel();
                MyFrame.this.remove(hp);
                MyFrame.this.add(hp);
                hp.add(ongaku);
                hp.setVisible(true);
                hp.repaint();

            }
        });
        veryhard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fkz.setVisible(false);
                vhp= new VeryHardPanel();
               MyFrame.this.remove(vhp);
               vhp.add(ongaku);
                vhp.setVisible(true);
                vhp.repaint();

            }
        });
        impossible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fkz.setVisible(false);
                imp = new ImpossiblePanel();
                MyFrame.this.remove(imp);
                MyFrame.this.add(imp);
                imp.add(ongaku);
                imp.setVisible(true);
                imp.repaint();

            }
        });
        this.setSize(1280,720);
        this.setLayout(null);
        this.setTitle("ポケモンゲーム");
        this.setFont(new Font("pp",Font.BOLD,15));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }
}

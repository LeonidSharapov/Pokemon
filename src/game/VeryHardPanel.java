package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

    class VeryHardPanel extends JPanel {
    public  int miss = 0;
    public  int point = 0;
    private ArrayList<Buttons> button = new ArrayList<>();
    private ArrayList<Labels> label = new ArrayList<>();
    private ArrayList<String> icon = new ArrayList<>();
    JButton jb;
    private int xb;
    private int yb;
    private int xp;
    private int yp;
    private Timer timer;
    private final int[] numberone = {-1};
    private final int[] numbertwo = {-1};
    protected VeryHardPanel(){
//add
        icon.add("pokemon_icon\\Blastoise.png");
        icon.add("pokemon_icon\\Crobat.png");
        icon.add("pokemon_icon\\Pickachu.png");
        icon.add("pokemon_icon\\Slaking.png");
        icon.add("pokemon_icon\\Venusaur.png");
        icon.add("pokemon_icon\\Giratin.png");
        icon.add("pokemon_icon\\Gardevoir.png");
        icon.add("pokemon_icon\\Gengar.png");
        icon.add("pokemon_icon\\Meowth.png");
        icon.add("pokemon_icon\\Mewtwo.png");
        icon.add("pokemon_icon\\Blastoise.png");
        icon.add("pokemon_icon\\Crobat.png");
        icon.add("pokemon_icon\\Pickachu.png");
        icon.add("pokemon_icon\\Slaking.png");
        icon.add("pokemon_icon\\Venusaur.png");
        icon.add("pokemon_icon\\Giratin.png");
        icon.add("pokemon_icon\\Gardevoir.png");
        icon.add("pokemon_icon\\Gengar.png");
        icon.add("pokemon_icon\\Meowth.png");
        icon.add("pokemon_icon\\Mewtwo.png");
        icon.add("pokemon_icon\\Loudred.png");
        icon.add("pokemon_icon\\Loudred.png");
        icon.add("pokemon_icon\\Zangoose.png");
        icon.add("pokemon_icon\\Zangoose.png");
        icon.add("pokemon_icon\\Charizard.png");
        icon.add("pokemon_icon\\Charizard.png");
        icon.add("pokemon_icon\\Plusle.png");
        icon.add("pokemon_icon\\Plusle.png");
        icon.add("pokemon_icon\\Horsea.png");
        icon.add("pokemon_icon\\Pidgeotto.png");
        icon.add("pokemon_icon\\Pidgeotto.png");
        icon.add("pokemon_icon\\Mime.png");
        icon.add("pokemon_icon\\Koffing.png");
        icon.add("pokemon_icon\\Mime.png");
        icon.add("pokemon_icon\\Koffing.png");
        icon.add("pokemon_icon\\Electivire.png");
        icon.add("pokemon_icon\\Electivire.png");
        icon.add("pokemon_icon\\Lickitung.png");
        icon.add("pokemon_icon\\Lickitung.png");
        icon.add("pokemon_icon\\Seviper.png");
        icon.add("pokemon_icon\\Seviper.png");
        icon.add("pokemon_icon\\Sneasel.png");
        icon.add("pokemon_icon\\Sneasel.png");
        icon.add("pokemon_icon\\Delibird.png");
        icon.add("pokemon_icon\\Delibird.png");
        icon.add("pokemon_icon\\Mightyena.png");
        icon.add("pokemon_icon\\Mightyena.png");
        icon.add("pokemon_icon\\Claydol.png");
        icon.add("pokemon_icon\\Claydol.png");
        icon.add("pokemon_icon\\Combusken.png");
        icon.add("pokemon_icon\\Combusken.png");
        icon.add("pokemon_icon\\Makuhita.png");
        icon.add("pokemon_icon\\Makuhita.png");
        icon.add("pokemon_icon\\Spinda.png");
        icon.add("pokemon_icon\\Spinda.png");
        icon.add("pokemon_icon\\Shellder.png");
        icon.add("pokemon_icon\\Shellder.png");
        icon.add("pokemon_icon\\Psyduck.png");
        icon.add("pokemon_icon\\Psyduck.png");
        icon.add("pokemon_icon\\Azurill.png");
        icon.add("pokemon_icon\\Azurill.png");
        icon.add("pokemon_icon\\Alakazam.png");
        icon.add("pokemon_icon\\Alakazam.png");
        icon.add("pokemon_icon\\Hypno.png");
        icon.add("pokemon_icon\\Hypno.png");
        icon.add("pokemon_icon\\Clefairy.png");
        icon.add("pokemon_icon\\Clefairy.png");
        icon.add("pokemon_icon\\Tentacruel.png");
        icon.add("pokemon_icon\\Tentacruel.png");
        icon.add("pokemon_icon\\Solrock.png");
        icon.add("pokemon_icon\\Solrock.png");

        //

        xp = 250;
        yp = 50;
        final int[] indextwo = {-1};
        final int[] indexone = {-1};
        final int[] visible = {0};
        for (int j = 0; j < 70; j++) {
            int rand = new Random().nextInt(icon.size());
            Labels lab = new Labels();
            Icon ic = new ImageIcon(icon.get(rand));
            lab.setIcon(ic);
            icon.remove(rand);
            label.add(lab);
            label.get(j).setVisible(true);
            label.get(j).setBounds(xp, yp, 72, 72);
            super.add(label.get(j));
            if (xp >= 850) {
                xp = 250;
                yp += 73;
            } else {
                xp += 73;
            }
        }
        jb = new JButton();
        jb.setFocusable(false);
        super.setLayout(null);
        super.setSize(new Dimension(1280, 720));
        jb.setBounds(540, 550, 150, 50);
        jb.setText("Start");
        super.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexone[0] = -1;
                indextwo[0] = -1;
                xb = 250;
                yb = 50;
                for (int i = 0; i < 70; i++) {
                    indexone[0] += 1;
                    indextwo[0] += 1;
                    Buttons b = new Buttons();
                    b.setVisible(true);
                    b.setBounds(xb, yb, 72, 72);
                    label.get(i).setVisible(false);
                    int finalIndexone = indexone[0];
                    int finalIndextwo = indextwo[0];
                    button.add(b);


                    b.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (numberone[0] < 0) {
                                numberone[0] = finalIndexone;
                                button.get(numberone[0]).setVisible(false);
                                label.get(numberone[0]).setVisible(true);


                            } else if (numberone[0] >= 0 && numbertwo[0] < 0) {
                                numbertwo[0] = finalIndextwo;
                                button.get(numbertwo[0]).setVisible(false);
                                label.get(numbertwo[0]).setVisible(true);
                            }

                            if (numberone[0] >= 0 && numbertwo[0] >= 0) {
                                for (int i = 0; i < 70; i++) {
                                    if (button.get(i).isVisible()) {
                                        button.get(i).setEnabled(false);
                                    }
                                }
                                timer = new Timer(700, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        visible[0] += 1;
                                        if (visible[0] == 2) {
                                            visible[0] = 0;
                                            checking();
                                        }
                                    }
                                });
                                timer.setRepeats(true);
                                timer.setCoalesce(true);
                                timer.setInitialDelay(0);
                                timer.start();
                            }
                            VeryHardPanel.this.repaint();
                        }
                    });

                    VeryHardPanel.this.add(b);
                    if (xb >= 850) {
                        xb = 250;
                        yb += 73;
                    } else {
                        xb += 73;
                    }
                }
                jb.setVisible(false);
            }
        });
        this.setVisible(false);
    }

    private void checking() {

        timer.restart();
        timer.stop();
        for (int i = 0; i < 70; i++) {
            if (!button.get(i).isEnabled()) {
                button.get(i).setEnabled(true);
            }
        }
        if (String.valueOf(label.get(numberone[0]).getIcon()).equals
                (String.valueOf(label.get(numbertwo[0]).getIcon()))) {
            numberone[0] = -1;
            numbertwo[0] = -1;
            point += 2;


        } else {
            label.get(numberone[0]).setVisible(false);
            label.get(numbertwo[0]).setVisible(false);
            button.get(numberone[0]).setVisible(true);
            button.get(numbertwo[0]).setVisible(true);
            numberone[0] = -1;
            numbertwo[0] = -1;
            miss += 1;


        }
        if (point == 70) {
            VeryHardPanel.super.repaint();
            OvariPanel.misspoint.setText(String.valueOf(miss));

            MyFrame.end.setVisible(true);
            this.setVisible(false);
            jb.setVisible(true);
            point=0;
            miss=0;


        }

    }
    public void paintComponent (Graphics g){
            Image im = null;
            try {
                im = ImageIO.read(new File("pokemon_icon\\2.jpg"));
            } catch (IOException ignored) {
            }
            g.drawImage(im, 0, 0, null);
        }



}


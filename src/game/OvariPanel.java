package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   class OvariPanel extends JPanel {
   public static JLabel misspoint = new JLabel();
   private  JLabel miss = new JLabel("MISS CLICK");
    protected OvariPanel(){
        super.setLayout(null);
        super.setSize(1280,720);
        JButton menu= new JButton("MAIN MENU");
       menu.setBounds(250,250,100,50);
        menu.setBounds(575,550,100,50);
        miss.setFont(new Font("miss text",Font.BOLD,50));
        miss.setBounds(488,85,300,80);
        misspoint.setFont(new Font("miss value",Font.BOLD,75));
        misspoint.setBounds(585,180,150,100);
        super.add(menu);
        super.add(miss);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.end.setVisible(false);
                MyFrame.fkz.setVisible(true);


            }
        });
        super.add(misspoint);
        super.setVisible(false);
    }


}

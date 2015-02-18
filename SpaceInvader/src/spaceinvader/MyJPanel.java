
package spaceinvader;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.*;

public class MyJPanel extends BackgroundPanel
{
    
    JButton start, exit, character1, character2, target1, target2, background1, background2;
    JLabel label1, label2, label3, label4, high, low, medium;
    JSlider slider;
    
    Font font = new Font("Comic Sans", Font.BOLD,14);
    Font font2 = new Font("Comis Sans", Font.BOLD,14);

    
    
    public MyJPanel(Image image)
    {
            
                super(image);
		setBackground(Color.white);
                

                
		setLayout(null);

                start = new JButton("Start the game");
                start.setFont(font2);
                start.setForeground(Color.blue);
                
                exit = new JButton("Exit");
                exit.setFont(font2);
                exit.setForeground(Color.blue);


                label1 = new JLabel("Choose a character");
                label2 = new JLabel("Choose a target");
                label3 = new JLabel("Choose a background");
                label4 = new JLabel("Choose Difficulty");
                
                high = new JLabel("High");
                medium = new JLabel("medium");
                low = new JLabel("low");
                
                character1 = new JButton();
                
                character2 = new JButton();
                
                target1 = new JButton();
                target2 = new JButton();
                
                
                background1 = new JButton();
                background2 = new JButton();
                
                

                slider = new JSlider();
                
                                
                start.setBounds(new Rectangle(20,100,150,50));
                exit.setBounds(new Rectangle(20,200,150,50));
                
                
                label1.setBounds(new Rectangle(405,10,150,50));
                character1.setBounds(new Rectangle(400,50,50,50));
                character2.setBounds(new Rectangle(500,50,50,50));
                
                label2.setBounds(new Rectangle(420,100,150,50));
                target1.setBounds(new Rectangle(400, 140, 50, 50));
                target2.setBounds(new Rectangle(500, 140, 50, 50));
                
                
                label3.setBounds(new Rectangle(397,200,160,50));
                background1.setBounds(new Rectangle(400, 240, 50, 50));
                background2.setBounds(new Rectangle(500, 240, 50, 50));
                
                
                label4.setBounds(new Rectangle(420, 330, 150, 50));
                slider.setBounds(new Rectangle(350, 280, 250, 250));
                
                high.setBounds(new Rectangle(355, 400, 50, 50));
                high.setFont(font);
                high.setForeground(Color.white);
                
                
                medium.setBounds(new Rectangle(448, 400, 150, 50));
                medium.setFont(font);
                medium.setForeground(Color.white);
                
                
                low.setBounds(new Rectangle(570, 400, 50, 50));
                low.setFont(font);
                low.setForeground(Color.white);
                
                
               label1.setForeground(Color.white);
               label2.setForeground(Color.white);
               label3.setForeground(Color.white);
               label4.setForeground(Color.white);
               
               label1.setFont(font);
               label2.setFont(font);
               label3.setFont(font);
               label4.setFont(font);

                add(start);
                add(exit);
                add(label1);
                add(label2);
                add(label3);
                add(label4);
                add(character1);
                add(character2);
                add(target1);
                add(target2);
                add(background1);
                add(background2);
                add(slider);
                add(high);
                add(medium);
                add(low);
                
                
    }
    
    
}

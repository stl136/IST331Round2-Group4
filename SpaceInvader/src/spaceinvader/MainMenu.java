
package spaceinvader;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainMenu extends BackgroundPanel implements ActionListener
{
    
    JButton start, exit;
    JLabel label1, label2, label3, label4, high, low, medium;
    JSlider slider;
    
    JLabel background1, background2, character1, character2, target1, target2;
    
    JRadioButton bg1, bg2 , c1, c2, t1, t2;
    
    Font font = new Font("Comic Sans", Font.BOLD,14);
    Font font2 = new Font("Comis Sans", Font.BOLD,14);

    ImageIcon characterIcon1 = new ImageIcon("character1.jpg");
    ImageIcon characterIcon2 = new ImageIcon("character2.jpg");
    
    ImageIcon targetIcon1 = new ImageIcon("target1.jpg");
    ImageIcon targetIcon2 = new ImageIcon("target2.jpg");
    
    ImageIcon backgroundIcon1 = new ImageIcon("bg1.jpg");
    ImageIcon backgroundIcon2 = new ImageIcon("bg2.jpg");
 
    MyJFrame jFrame;
    
    public MainMenu(Image image, MyJFrame jFrame)
    {
            
                super(image);
		setBackground(Color.white);
                

                this.jFrame = jFrame;
                
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
                
                character1 = new JLabel(characterIcon1);
                character2 = new JLabel(characterIcon2);
                
                target1 = new JLabel(targetIcon1);
                target2 = new JLabel(targetIcon2);
                
                
                background1 = new JLabel(backgroundIcon1);
                background2 = new JLabel(backgroundIcon2);
                
                
                //group radio buttons. backgroud groups
                ButtonGroup bgGroup = new ButtonGroup();
                bg1 = new JRadioButton();
                bg2 = new JRadioButton();
                bgGroup.add(bg1);
                bgGroup.add(bg2);
                
                //character radio button group
                ButtonGroup cGroup = new ButtonGroup();
                c1 = new JRadioButton();
                c2 = new JRadioButton();
                cGroup.add(c1);
                cGroup.add(c2);
                
                //target radio buttButtonGroup 
                ButtonGroup tGroup = new ButtonGroup();
                t1 = new JRadioButton();
                t2 = new JRadioButton();
                tGroup.add(t1);
                tGroup.add(t2); 

                slider = new JSlider();
             
                //Get the current value
                slider.setMinorTickSpacing(25);
                slider.setMajorTickSpacing(25);
                slider.setPaintTicks(true);
                slider.setSnapToTicks(true);    
                

                                
                start.setBounds(new Rectangle(20,100,150,50));
                exit.setBounds(new Rectangle(20,200,150,50));
                
                
                label1.setBounds(new Rectangle(405,10,150,50));
                character1.setBounds(new Rectangle(400,50,50,50));
                character2.setBounds(new Rectangle(500,50,50,50));
                c1.setBounds(new Rectangle(455,50,50,50));
                c2.setBounds(new Rectangle(555, 50,50,50));
                c1.setSelected(true);
                
                
                label2.setBounds(new Rectangle(420,100,150,50));
                target1.setBounds(new Rectangle(400, 140, 50, 50));
                target2.setBounds(new Rectangle(500, 140, 50, 50));
                t1.setBounds(new Rectangle(455, 140, 50, 50));
                t2.setBounds(new Rectangle(555, 140, 50, 50));
                t1.setSelected(true);
                
                
                label3.setBounds(new Rectangle(397,200,160,50));
                background1.setBounds(new Rectangle(400, 240, 50, 50));
                background2.setBounds(new Rectangle(500, 240, 50, 50));
                bg1.setBounds(new Rectangle(460, 254, 20, 20));
                bg2.setBounds(new Rectangle(560, 240, 50, 50));
                bg1.setSelected(true);
                
                
                label4.setBounds(new Rectangle(420, 330, 150, 50));
                slider.setBounds(new Rectangle(360, 270, 250, 250));
                
                high.setBounds(new Rectangle(365, 400, 50, 50));
                high.setFont(font);
                high.setForeground(Color.white);
                
                
                medium.setBounds(new Rectangle(458, 400, 150, 50));
                medium.setFont(font);
                medium.setForeground(Color.white);
                
                
                low.setBounds(new Rectangle(580, 400, 50, 50));
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
               
               start.addActionListener(this);
               exit.addActionListener(this);
               
               
               
               
               
               
               
               

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
                add(bg1);
                add(bg2);
                add(c1);
                add(c2);
                add(t1);
                add(t2);
                
                
    }

 

    private static class ButtonListener 
    {

        public ButtonListener() 
        {
            
        }
    }
    
   
      public void actionPerformed(ActionEvent e) 
      {
          Object obj = e.getSource();
          if(obj == exit)
          {
              System.exit(0);
          }
          
          
          if(obj == start) 
          {
            GamePanel gamePanel = new GamePanel(0);
            
            jFrame.remove(this);
            jFrame.add(gamePanel);
            jFrame.revalidate();
            jFrame.pack();
            
          } 
          else 
          {
              
          }
          
          
        
      }
          

          
      
    
    
}

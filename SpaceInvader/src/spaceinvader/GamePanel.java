
package spaceinvader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener
{
    Image image1, image2;
    JLabel alien, alien1, alien2, alien3, alien4, target1;
    
    ImageIcon alienIcon;
    ImageIcon targetIcon;
    Timer timer;
    
    public GamePanel(int defaultBackground, int defaultCharacter, int defaultTarget)
        {
            
           // System.out.println(defaultBackground);
            System.out.println(defaultCharacter);
            setFocusable(true);
            
            try 
                {
                    if(defaultBackground == 0)
                    {
                    image1 = ImageIO.read(new File("src/bgImages/background1.jpg"));
                    }
                    else
                    image1 = ImageIO.read(new File("src/bgImages/background2.jpg"));
                    
                    if(defaultCharacter == 0)
                    {
                    alienIcon = new ImageIcon("character1.png");
                    }
                    else
                    alienIcon = new ImageIcon("character2.png");
                    
                    if(defaultTarget == 0)
                    {
                        targetIcon = new ImageIcon("target1.png");
                    }
                    else
                    {
                        targetIcon = new ImageIcon("target2.png");
                    }
                        
                    
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }

            
            
            setMinimumSize(new Dimension(640, 480));
            setPreferredSize(new Dimension(640, 480));
            setLayout(null);
            
                    
            target1 = new JLabel(targetIcon);   
            
            alien = new JLabel(alienIcon);
            alien1 = new JLabel(alienIcon);
            alien2 = new JLabel(alienIcon);
            alien3 = new JLabel(alienIcon);
            alien4 = new JLabel(alienIcon);
            
            alien.setBounds(new Rectangle(200, 100, 50,50));
            alien1.setBounds(new Rectangle(250, 100, 50,50));
            alien2.setBounds(new Rectangle(300, 100, 50,50));
            alien3.setBounds(new Rectangle(350, 100, 50,50));
            alien4.setBounds(new Rectangle(400, 100, 50,50));
            
            target1.setBounds(new Rectangle(0, 430, 50, 50));
            addKeyListener(this);
            
            add(alien);
            add(alien1);
            add(alien2);
            add(alien3);
            add(alien4);
            add(target1);
            
        }
    
    
    
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        requestFocusInWindow();
        
        if (image1 != null)
        {
            
            g.drawImage(image1,0,0,this);
        }
    }
     
     public void keyPressed(KeyEvent e) 
      {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
           int targetX = target1.getX();
           
            if(target1.getX() == 0)
           {
              targetX += 0; 
           }
           else
           {
           targetX -= 25;
           target1.setBounds(new Rectangle(targetX, 430, 50, 50)); 
           }
            
            
           

        }

        if (key == KeyEvent.VK_RIGHT) {
           int targetX = target1.getX();
           
           if(target1.getX() >= 590)
           {
             targetX += 0;  
           }
           else
           {
           targetX += 25;
           target1.setBounds(new Rectangle(targetX, 430, 50, 50)); 
           }

        }
     
}

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
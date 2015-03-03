
package spaceinvader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener
{
    Image image1, image2;
    
    ArrayList<Alien> aliens;
    
    boolean movingRight = true;
    boolean movingDown = false;
    
    
    JLabel target1, alien1;
    
    
    ImageIcon alienIcon;
    ImageIcon targetIcon;
    Timer timer;
    TimerListener listener;
    
    
    public GamePanel(int defaultBackground, int defaultCharacter, int defaultTarget)
        {
            
           // System.out.println(defaultBackground);
            System.out.println(defaultCharacter);
            setFocusable(true);
            
         //   timer.start();
            this.aliens = new ArrayList<Alien>();
            int x = 50;
            int y = 50;
            for (int i = 1; i < 17; i++) 
            {
                if(i <= 4)
                {
                    this.aliens.add(new Alien(x, y,true));
                    x +=150;
                }
                if(i > 4 && i <=8)
                {                    
                    this.aliens.add(new Alien((x - 600), (y + 100), true));
                    x+=150;
                }
                if(i > 8 && i<= 12)
                {
                  this.aliens.add(new Alien((x - 1200), (y + 200), true));
                    x+=150;
                }
                if(i > 12 && i<= 16)
                {
                  this.aliens.add(new Alien((x - 1800), (y + 300), true));
                   x+=150;
                }     
            }
	 
            
            
            
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
            
            for (Alien a : aliens)
            {
                alien1 = new JLabel(alienIcon);
                alien1.setBounds(new Rectangle(a.alienX, a.alienY));
                add(alien1);
            }

            
            
            setMinimumSize(new Dimension(640, 480));
            setPreferredSize(new Dimension(640, 480));
            setLayout(null);
            
                    
            target1 = new JLabel(targetIcon);   
            
            target1.setBounds(new Rectangle(0, 430, 50, 50));
            addKeyListener(this);
       
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
     
     
     private class TimerListener implements ActionListener
        {
            Random r = new Random(); 
            int clicked;
            

            public void actionPerformed(ActionEvent e)
            {
                 if (e.getSource() == timer)
                {
                    
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
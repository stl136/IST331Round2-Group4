
package spaceinvader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
    Image image1;
    JLabel alien, alien1, alien2, alien3, alien4;
    ImageIcon alienIcon = new ImageIcon("character1.jpg");
    
    public GamePanel(int bg1)
        {
            try 
                {
                    image1 = ImageIO.read(new File("src/bgImages/background1.jpg"));
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }

            
            setMinimumSize(new Dimension(640, 480));
            setPreferredSize(new Dimension(640, 480));
            setLayout(null);
            
                    
               
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
            
            add(alien);
            add(alien1);
            add(alien2);
            add(alien3);
            add(alien4);
            
        }
    
    
    
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (image1 != null)
        {
            
            g.drawImage(image1,0,0,this);
        }
    }
}

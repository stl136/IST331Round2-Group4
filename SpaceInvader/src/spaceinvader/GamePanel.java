
package spaceinvader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
    Image image1;
    
    public GamePanel(int bg1)
        {
            try 
                {
                    image1 = ImageIO.read(new File("src/bgImages/background1.jpg"));
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }

            
            setBackground(Color.red);
            setMinimumSize(new Dimension(640, 480));
            setPreferredSize(new Dimension(640, 480));
                    
                    
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

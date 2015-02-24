
package spaceinvader;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyJFrame extends JFrame
{

    MainMenu mjp;
    public MyJFrame ()
	{
		super ("Space Invader Game");
                
                //------------------------------------------------------
                // Create components
		

                Image img = null;
                try 
                {
                    img = ImageIO.read(new File("background.jpg"));
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }


  	 	mjp = new MainMenu(img, this);
                
             
                
                
                this.setLocationRelativeTo(null);
                this.setLocation(320, 150);
                this.setResizable(false); 
    	
                //------------------------------------------------------
                // Choose a Layout for JFrame and 
                // add Jpanel to JFrame according to layout
                
                
                getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
                
               

                

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}
    
}

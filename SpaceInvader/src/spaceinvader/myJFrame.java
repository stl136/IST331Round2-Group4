
package spaceinvader;

import java.awt.BorderLayout;
import javax.swing.*;

public class myJFrame extends JFrame
{

    myJPanel mjp;
    public myJFrame ()
	{
		super ("Space Invader Game");
                
                //------------------------------------------------------
                // Create components
		

  	 	mjp = new myJPanel();
    	
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

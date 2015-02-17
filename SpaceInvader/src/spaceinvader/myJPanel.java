
package spaceinvader;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author gOD
 */
public class myJPanel extends JPanel
{
    


    
    public myJPanel()
	{
            super();
            
            
            
		setBackground(Color.gray);
		
		setLayout(new BorderLayout());
                
                mainMenu menu1 = new mainMenu();
                add(menu1, "North");
                
                
                
}
}

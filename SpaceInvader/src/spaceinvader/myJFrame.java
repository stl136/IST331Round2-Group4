/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvader;

import javax.swing.*;

/**
 *
 * @author gOD
 */
public class myJFrame extends JFrame{
    
    public myJFrame ()
	{
		super ("Space Invader Game");
		

  	 	myJPanel mjp = new myJPanel();
    	
		getContentPane().add(mjp,"Center");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}
    
}

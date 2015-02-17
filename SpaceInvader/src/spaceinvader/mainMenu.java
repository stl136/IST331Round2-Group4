
package spaceinvader;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class mainMenu extends myJPanel
{
    JButton start, exit, character1, character2, target1, target2, background1, background2;
    JLabel label1, label2, label3, label4;
    JSlider slider;
    JPanel mjp;
   
    public mainMenu()
    {
        
            mjp = new JPanel();
            
        
            start = new JButton("Start the game");
            exit = new JButton("Exit");
            
            label1 = new JLabel("Choose a character");
            label2 = new JLabel("Choose a target");
            label3 = new JLabel("Choose a background");
            label4 = new JLabel("Choose Difficulty");
            
            slider = new JSlider();
            
            mjp.add(start);
            mjp.add(exit);
            mjp.add(label1);
            mjp.add(label2);
		
    }
    
    
}

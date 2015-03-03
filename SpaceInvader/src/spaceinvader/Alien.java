
package spaceinvader;

import javax.swing.JLabel;

    public class Alien 
    {
    JLabel alien = new JLabel();

    int alienX, alienY; 
    boolean exists;

    public Alien(int alienX, int alienY, boolean exists)
    {
        this.alienX = alienX;
        this.alienY = alienY;
        this.exists = exists;

    }

}
    

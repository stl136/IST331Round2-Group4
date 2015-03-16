
package spaceinvader;

import javax.swing.JLabel;

    public class Alien 
    {
    JLabel alien = new JLabel();

    int alienX, alienY; 
    boolean exists;
    boolean moveRight = true;

    public Alien(int alienX, int alienY, boolean exists)
    {
        this.alienX = alienX;
        this.alienY = alienY;
        this.exists = exists;
       

    }
    
    public void isShot(){
        exists = false;
        
    }
    
    public void move(){
        if(alienX < 1200 && moveRight == true)
            alienX += 10;
        else if(alienX == 1200 && moveRight == true){
            alienY += 100;
            moveRight = false;
        }
            
        else if (alienX > 100 && moveRight == false){
            alienX -= 10;
        }
        else if(alienX == 100 && moveRight == false){
            alienY += 100;
            moveRight = true;
        }
    }

}
    

import greenfoot.*;

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("click.mp3");
            Greenfoot.setWorld(new Covid1());
        }
    }    
}

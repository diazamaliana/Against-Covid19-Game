import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial extends World
{

    /**
     * Constructor for objects of class tutorial.
     * 
     */
    public tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1); 
        
        prepare();
    }
    
     private void prepare()
    {
         brick brick = new brick();
        addObject(brick,550,539);
        
        Player player = new Player();
        addObject(player,58,504);
 
        Greenfoot.start();
        start start = new start();
        addObject(start, 550, 291);
        
     
        close close = new close();
        addObject(close, 1057, 40);
        
    }
}

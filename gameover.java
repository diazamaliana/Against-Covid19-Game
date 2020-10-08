import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{

    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        super(1100, 550, 1); 
        
        prepare();
    }
    
     private void prepare()
    {
        Greenfoot.start();
        again again = new again();
        addObject(again, 550, 344);
        
        close close = new close();
        addObject(close, 1057, 40);
        
    }
}

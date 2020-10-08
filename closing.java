import greenfoot.*;

/**
 * Write a description of class opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class closing extends World
{

    /**
     * Constructor for objects of class opening.
     * 
     */
    public closing()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1); 
        bkgMusic = new GreenfootSound("sounds/hello.mp3");

        prepare();
        stopped();
      
    }
    
    private GreenfootSound bkgMusic;
    
    public void stopped()
    {
        
        bkgMusic.stop();
    }
    

    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   private void prepare()
    {
        Greenfoot.start();
        again again = new again();
        addObject(again, 550, 344);
        
        plane plane = new plane();
        addObject(plane, 1039, 105);
        
        safe safe = new safe();
        addObject(safe, 550, 238);
        
        close close = new close();
        addObject(close, 1057, 40);
        
    }
}

import greenfoot.*;

/**
 * Write a description of class opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class opening extends World
{

    /**
     * Constructor for objects of class opening.
     * 
     */
    public opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1); 

        prepare();
    }
    


    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.start();
        start start = new start();
        addObject(start, 550, 291);
        
        tutorialButton tutorialbutton = new tutorialButton();
        addObject(tutorialbutton, 148, 458);
        tutorialbutton.setLocation(550, 356);
        
        
        
}
}

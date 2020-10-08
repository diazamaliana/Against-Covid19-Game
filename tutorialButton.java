import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorialButton extends Actor
{
    /**
     * Act - do whatever the tutorialButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("click.mp3");

            Greenfoot.setWorld(new tutorial());
        }
    }    
}

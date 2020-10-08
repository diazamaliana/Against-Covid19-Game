import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inject extends Actor
{
    /**
     * Act - do whatever the inject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        move(9);
        if (isAtEdge()) getWorld().removeObject(this);
        else if (isTouching(platform.class)) getWorld().removeObject(this);
    }    
}

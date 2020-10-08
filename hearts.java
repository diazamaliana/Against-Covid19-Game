import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hearts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hearts extends Actor
{
    /**
     * Act - do whatever the hearts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Player.lives == 1)
        {
            setImage("hearts1.png");
        }
        if (Player.lives == 2)
        {
            setImage("hearts2.png");
        }
        if (Player.lives == 3)
        {
            setImage("hearts3.png");
        }
        if (Player.lives == 4)
        {
            setImage("hearts4.png");
        }
        if (Player.lives == 5)
        {
            setImage("hearts5.png");
        }
        if (Player.lives == 0)
        {
            setImage("nothing.png");
        }
    }    
}


 
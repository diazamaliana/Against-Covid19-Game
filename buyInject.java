import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buyInject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buyInject extends Actor
{
    /**
     * Act - do whatever the buyInject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("down") && Player.soap >= 10)
        {
            Player.ammo = Player.ammo + 5;
            Player.soap = Player.soap - 10;
            Greenfoot.playSound("buy.mp3");

        }
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
   
    private int speed = 3;
    private int pause = 50;
    public static int Pspeed = 3;
    /**
     * Act - do whatever the movingPlat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        move();
        checkEdge();
    }
    public void move()
    {
        move(speed);

    }
    public void checkEdge()
    {
        if(isAtEdge())
        {
            speed = speed * -1;
            Pspeed = Pspeed * -1;
        }
        if (isTouching(platform1.class))
        {
            if (pause > 0)
            {
                pause--;
                speed = 0;
            }
            else if (pause == 0)
            {
                speed = -3;
                speed = speed * -1;
                pause = 50;
            }
        }
        if (isTouching(barrier.class))
        {
            speed = speed * -1;
        }
    }
    
    
    
}

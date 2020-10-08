import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed = 0;
    private int acc = 1;
    private int jumpS = -17;
    private int timer;
    private int frame = 1;
    private int animationCount = 0;
    private int speed = 5;
    private boolean hasKey = false;
    public static int spawnX = 0;
    public static int spawnY = 0;
    public static int ammo = 0;
    public static int lives = 5;
    public static int soap = 0;
    public static int x = 0;
    public static int y = 0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        controls();
        checkFall();
        checkLives();
        checkSoaps();
        nextLevel();
        platformAbove();
        checkLeftWalls();
        checkRightWalls();
        speed = 5;
        animationCount++;
        x = getX();
        y = getY();
    }   

    
    public boolean onGround()
    {

        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, brick.class);  
        return under != null;  

    }

    
    public boolean onPlatform()
    {
        Actor under = getOneObjectAtOffset (0, getImage().getHeight()/2, platform.class);  
        return under != null; 
    }

    public void fall()
    {
        setLocation(getX(),getY()+vSpeed);
        vSpeed = vSpeed + acc;
    }

    public void checkFall()
    {
        if (onGround())
        {
            vSpeed = 0;
        }
        else if (onPlatform())
        {
            vSpeed = 0;
        }

        else
        {
            fall();
        }
    }

    public void jump()
    {
        vSpeed = jumpS;
        fall();
    }

    public void controls()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            if (animationCount % 4 == 0) animateRight();
            move(speed);

        }
        if (Greenfoot.isKeyDown("left"))
        {
            if (animationCount % 4 == 0) animateLeft();
            move(speed);

        }
        if (Greenfoot.isKeyDown("up") && onGround() || Greenfoot.isKeyDown("up") && onPlatform() )
        {

            jump();
            Greenfoot.playSound("jump.mp3");

        }
        
        if (timer > 0) timer--;
        if (timer == 0 && Greenfoot.isKeyDown("space"))
        {
            if (ammo > 0)
            {
                inject inject = new inject();
                inject.setRotation(getRotation());
                if (inject.getRotation() == 0)
                {
                    setImage("player_shootR.png");
                }
                else if (inject.getRotation() == 180)
                {
                    setImage("player_shootL.png");
                }
                getWorld().addObject(inject,getX(),getY());
                Greenfoot.playSound("shoot.mp3");

                ammo = ammo - 1;
                timer = 30;
            }
        }
    }

    public void animateLeft()
    {
        if (frame == 1)
        {
            setRotation(180);
            setImage("player_left.png");
        }
        else if (frame == 2) 
        {
            setRotation(180);
            setImage("player_left2.png");
        }
        else if (frame == 3) 
        {
            setRotation(180);
            setImage("player_left3.png");
        }
        else if (frame == 4)
        {
            setRotation(180);
            setImage("player_left4.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public void animateRight()
    {
        if (frame == 1) 
        {
            setRotation(0);
            setImage("player_right.png");
        }
        else if (frame == 2)
        {
            setRotation(0);
            setImage("player_right2.png");
        }
        else if (frame == 3)
        {
            setRotation(0);
            setImage("player_right3.png");
        }
        else if (frame == 4)
        {
            setRotation(0);
            setImage("player_right4.png");
            frame = 1;
            return;
        }
        frame++;
    }

    public void checkLives()
    {
        if (isTouching(virus.class))
        {
            die();
            Greenfoot.playSound("die.mp3");

        }
        
        if (lives == 0)
        {
            Greenfoot.setWorld(new gameover());

        }
    }

    public void die()
    {
        lives = lives - 1;
        setLocation(spawnX,spawnY);
    }

    public void checkSoaps()
    {
        if (isTouching(soap.class)) 
        {
            removeTouching(soap.class);
            Greenfoot.playSound("coin.mp3");

            soap = soap + 5;
        }
    }

    public void nextLevel()
    {
        if (isTouching(home5.class))
        {
            Greenfoot.setWorld(new opening());
        }
        if (isTouching(home.class))
        {
            Greenfoot.setWorld(new Covid2());
        }
        if (isTouching(home2.class))
        {
            Greenfoot.setWorld(new Covid3());
        }
        if (isTouching(home3.class))
        {
            Greenfoot.setWorld(new Covid4());
        }
        if (isTouching(home4.class))
        {
            Greenfoot.setWorld(new closing());
        }
         
        
    }

    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0, yDistance, platform.class);
        if(ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;
        }
        else
        {
            return false;
        }
    }

   

    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, platform.class);
        if(rightWall == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(rightWall);
            return true;
        }
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, platform.class);
        if(leftWall == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(leftWall);
            return true;
        }
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }

   
}

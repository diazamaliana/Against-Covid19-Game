import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Covid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Covid4 extends World
{

    /**
     * Constructor for objects of class Covid1.
     * 
     */
    public Covid4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1);
        
        prepare();

    }
    
    private void prepare()
    {
        brick brick = new brick();
        addObject(brick,550,539);
        
        platform1 platform12 = new platform1();
        addObject(platform12, 879, 297);

        platform1 platform13 = new platform1();
        addObject(platform13, 130, 130);
        
        platform1 platform14 = new platform1();
        addObject(platform14, 567, 539);
        
        movingPlatform movingPlatform = new movingPlatform();
        addObject(movingPlatform, 567, 186);
        
        movingPlatform movingPlatform1 = new movingPlatform();
        addObject(movingPlatform1, 328, 420);

        home4 home4 = new home4();
        addObject(home4, 953, 451);
        
        soap1 soap1 = new soap1();
        addObject(soap1, 322, 33);

        virus virus = new virus();
        addObject(virus, 997, 267);

        virus virus2 = new virus();
        addObject(virus2, 768, 267);
        
        virus virus3 = new virus();
        addObject(virus3, 440, 505);
        
        hearts hearts = new hearts();
        addObject(hearts, 99, 33);
        
        injectUI injectui = new injectUI();
        addObject(injectui, 239, 33);

        Player.lives = Player.lives;
        Player.ammo = Player.ammo;
        
        
        Player player = new Player();
        addObject(player,31,96);
        
        buyInject buyInject = new buyInject();
        addObject(buyInject, 897, 33);
        
        player.spawnX = 58;
        player.spawnY = 504;
    }
    
    public void act()
    {
        showText("= "+Player.ammo,250,33);
        showText("= "+Player.soap,330,33);
    }
}

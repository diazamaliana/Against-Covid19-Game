import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Covid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Covid2 extends World
{

    /**
     * Constructor for objects of class Covid1.
     * 
     */
    public Covid2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 550, 1);
        
        prepare();

    }
    
    private void prepare()
    {
        brick brick = new brick();
        addObject(brick,550,539);
        
        platform1 platform1 = new platform1();
        addObject(platform1, 921, 151);

        platform1 platform12 = new platform1();
        addObject(platform12, 542, 233);

        platform1 platform13 = new platform1();
        addObject(platform13, 718, 364);
        
        platform1 platform14 = new platform1();
        addObject(platform14, 348, 428);

        home2 home2 = new home2();
        addObject(home2, 931, 96);
        
        soap1 soap1 = new soap1();
        addObject(soap1, 322, 33);

        virus virus = new virus();
        addObject(virus, 563, 203);

        virus virus2 = new virus();
        addObject(virus2, 767, 332);
        
        virus virus3 = new virus();
        addObject(virus3, 341, 398);
        
        hearts hearts = new hearts();
        addObject(hearts, 99, 33);
        
        injectUI injectui = new injectUI();
        addObject(injectui, 239, 33);

        Player.lives = Player.lives;
        Player.ammo = Player.ammo;
        
        
        Player player = new Player();
        addObject(player,58,504);
        
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

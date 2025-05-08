import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen.
 * 
 * @author (Vivian Li) 
 * @version (May 2025)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop 
     */
    public void act()
    {
        //start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,500,100);
        elephant.setLocation(494,83);
        elephant.setLocation(550,78);
        elephant.setLocation(478,72);
        Label label = new Label("Press <space> to Start", 20);
        addObject(label,318,194);
        label.setLocation(302,211);
        Label label2 = new Label("Use <- and -> to move", 20);
        addObject(label2,357,263);
        label2.setLocation(303,247);
        label2.setLocation(315,284);
        label.setLocation(320,246);
        label2.setLocation(323,285);
        elephant.setLocation(317,136);
        elephant.setLocation(302,114);
        elephant.setLocation(298,140);
        elephant.setLocation(306,122);
        elephant.setLocation(305,102);
    }
}

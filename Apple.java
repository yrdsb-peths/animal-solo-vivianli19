import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the apple is food for elephant
 * 
 * @author vivian  
 * @version april 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Apple falls downward
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}

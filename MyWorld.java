import greenfoot.*;
/**
 * the world where our hero lives in
 * author: vivian
 * version: april 2025
 */
public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1);
        
        //create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        //create an apple
        createApple();
    }
    
    /**
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /** 
     * create a new apple at random location at top of screen. 
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}

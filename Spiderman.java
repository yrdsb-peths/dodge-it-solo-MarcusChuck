import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Spiderman extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetSpiderman();
        }
        
        if(isTouching(Hero.class))
        {
            End end = new End();
            getWorld().addObject(end, 300,200);
            getWorld().removeObject(this);
        }
    
        // Add your action code here.
    }
    
    public void resetSpiderman() {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0) {
            setLocation(600,100);
        }else{
            setLocation(600,300);
        }
        }
}


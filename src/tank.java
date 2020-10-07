import java.util.Arrays;
public class tank
{
    private int moveX;
    private int moveY;
    private int damage;
    private int freeze;
    private boolean frozen;
    private int health;
    private String powerUpp;
    
    private String[] powerUp;
    public tank(String nameOfThePlayer, int x, int y)
    {
        String[] powerUp = {"healerBoost", "damageBoost", "Freeze"};
        moveX = x;
        moveY = y;
        health = 100;
        damage = 20;
        frozen = false;
    }
    
    //in a runner class, a tank finds a powerUp (boolean becomes true) and activates this method
    public void powerUp()
    {
         powerUpp = powerUp[(int)(Math.random())*10];
        if(powerUp.equals("healerBoost"))
        {
            health= health +10;
        }
        if(powerUp.equals("damageBoost"))
        {
            damage= damage +10;
        }
        //If assuming, int freeze represents time the object is unable to move
        if(powerUp.equals("Freeze"))
        {
            freeze = freeze + 10;
            frozen = true;
        }
        
    }
    
    public int getX()
    {
        return moveX;
    }
    
    public int getY()
    {
        return moveY;
    }
}

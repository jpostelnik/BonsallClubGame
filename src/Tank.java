import java.util.Arrays;
public class Tank extends Entity
{
    private int moveX;
    private int moveY;
    private int damage;
    private int freeze;
    private boolean frozen;
    private int health;
    private String powerUpp;

    private int shootsRemaning =5;

    private String[] powerUp;

    public Tank(int entityID, String spriteID, int health, int xPosition, int yPositon, int damage, boolean freeze) {
        super(entityID, spriteID, health, xPosition, yPositon);
        this.damage = damage;
        this.frozen = freeze;
        this.powerUp = new String[3];
        powerUp[0] = "healerBoost"; powerUp[1] = "healerBoost"; powerUp[2] = "Freeze";
    }

    private void resetShots()
    {
        shootsRemaning = 5;
    }

    public int getMoveX() {
        return moveX;
    }

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFreeze() {
        return freeze;
    }

    public void setFreeze(int freeze) {
        this.freeze = freeze;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getPowerUpp() {
        return powerUpp;
    }

    public void setPowerUpp(String powerUpp) {
        this.powerUpp = powerUpp;
    }

    public int getShootsRemaning() {
        return shootsRemaning;
    }

    public void setShootsRemaning(int shootsRemaning) {
        this.shootsRemaning = shootsRemaning;
    }

    public String[] getPowerUp() {
        return powerUp;
    }

    public void setPowerUp(String[] powerUp) {
        this.powerUp = powerUp;
    }

    //in a runner class, a Tank finds a powerUp (boolean becomes true) and activates this method
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

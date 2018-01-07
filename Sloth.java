/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: Sloth.java
 */

import java.awt.*;
import java.util.Random;

/*This class implements the Sloth class*/
public class Sloth extends HappyAnimal {

    protected boolean movedNorth;
    protected boolean hasEaten;
    protected Direction dir;
    protected int value;
    /* Constructor: Create a new Sloth. */
    public Sloth() 
    {
        Random newRandom = new Random(2048);
        random = newRandom;
        hasEaten = false;
        movedNorth = true;
        this.dir = Direction.NORTH;
        super.displayName = "S";
        value =0;
    }

   /** eating behavior of sloth
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    { 
        int r = random.nextInt(100);
        if(hasEaten == true)
        {   
            if(r <= 95)
            {
                hasEaten = true;
                return true;
            }
            hasEaten = false;
            return false;
        }
        else
        {
            if(r <= 96) 
            {
                hasEaten = true;
                return true;
            }
            hasEaten = false;
            return false;
        }

    }   

   /** attacking behavior of sloth
    * @param String opponent 
    * @return Attack 
    * */
    @Override
    protected Attack fight(String opponent) {
        int r = random.nextInt(100);
        if(r > 10)
        {
            return Attack.ROAR;
        }
        if(r > 90)
        {
            return Attack.SCRATCH;
        }
        return Attack.FORFEIT;
    }

   /** move method of sloth
    * @return Direction 
    * */
    @Override
    protected Direction getMove() 
    {
        if(value % 2 == 0) 
        { 
            value++;
            return Direction.NORTH;
        }
        else
        {
            value++;
            return Direction.EAST;
        }   
    }

   /** overrides sleep method 
    * @return void 
    **/
    @Override
    protected void sleep() {
       displayName = "Zzz";
    }

   /** overrides wakeup method
    * @return void 
    **/
    @Override
    protected void wakeup() {
       displayName = "S";
    }
}

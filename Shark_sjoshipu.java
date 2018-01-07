/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: Shark_sjoshipu.java
 */

import java.awt.*;
import java.util.Random;

/* This class implements the Shark class */
public class Shark_sjoshipu extends Turtle {

    protected int sharkCounter;

    // Constructor: initialize the object.
    public Shark_sjoshipu() 
    {
        sharkCounter = 0; 
        super.displayColor = Color.gray;
        super.displayName = "Shark_sjoshipu";
    }

   /** eats anything
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    {  
        return true;
    }

   /** decides direction to move in
    * @return Direction 
    * */
    @Override 
    protected Direction getMove() 
    {
         if(count%3 == 0)
        {
            count++;
            return Direction.SOUTH;
        }
        count++;
        return Direction.CENTER;
    }

   /** decide what attack to use
    * @param String opponent 
    * @return Attack 
    * */
    @Override
    protected Attack fight(String opponent) 
    {
        Random num = new Random(3);
        int number = num.nextInt();
        if(number == 0)
        {
            attackReference = Attack.ROAR;
        }
        if(number == 1)
        {
            attackReference = Attack.POUNCE;
        }
        if(number == 2) 
        {
            attackReference = Attack.SCRATCH;
        }
        return attackReference;
    }

    /** generates attack as wins
    * @return void 
    **/
    @Override
    protected void win() 
    {
        super.generateAttack();
    }
}

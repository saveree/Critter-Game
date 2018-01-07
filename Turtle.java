/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: Turtle.java
 */

import java.awt.*;
import java.util.Random;

/* This class implements the Turtle class */
public class Turtle extends Omnivore {
    
    protected Attack attackReference;
    protected int randomNumber;

    // Constructor: initialize the object.
    public Turtle() 
    {
        super.displayName = "Tu";
        super.displayColor = Color.cyan;
        Random rand = new Random(8);
        randomNumber = rand.nextInt();
    }

   /** decides what attack to use
    * @return void 
    **/
    protected void generateAttack()
    {
        Random num = new Random(3);
        int number = num.nextInt();
        if(number == 1)
        {
            attackReference = Attack.ROAR;
        }
        if(number == 2)
        {
            attackReference = Attack.POUNCE;
        }
        if(number == 3) 
        {
            attackReference = Attack.SCRATCH;
        }
    }

   /** decides direction
    * @return Direction 
    **/
    @Override
    protected Direction getMove() 
    {
        if(count%3 == 0)
        {
            count++;
            return Direction.NORTH;
        }
        count++;
        return Direction.CENTER;
    }
    
   /** decides attack
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
        return this.attackReference;
    }

   /** generates attack as wins
    * @return void 
    **/
    @Override
    protected void win() 
    {
        generateAttack();
    }

   /** never eats, but decides new attack
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    {
        generateAttack();
        return false;
    }

}

/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: GreenTurtle.java
 */

import java.awt.*;
import java.util.Random;

/* This class implements the Green Turtle class */
public class GreenTurtle extends Turtle {
    
    protected Direction nextDir;
    protected Attack initialRoar;

    // Constructor: initialize the object.
    public GreenTurtle() 
    {
        super.displayName = "G";
        super.displayColor = Color.green;
        Random rand = new Random(9);
        super.randomNumber = rand.nextInt();
        nextDir = Direction.NORTH;
        initialRoar = Attack.ROAR;
    }

    /** decides attack
    * @return Direction 
    * */
    protected Direction generateMove()
    {
        Random newRandom = new Random(4);
        int r = newRandom.nextInt();
        if(r == 0)
        {
            return Direction.NORTH;
        }
        if(r == 1)
        {
            return Direction.SOUTH;
        }
        if(r == 2)
        {
            return Direction.EAST;
        }
        if(r == 3)
        {
            return Direction.WEST;
        }
        return Direction.CENTER;
    }

   /** chooses attack
    * @return void 
    **/
    @Override 
    protected void generateAttack()
    {
        Random r = new Random(10);
        int random = r.nextInt();
        if(random == 0)
        {
            attackReference = Attack.ROAR;
        }
        if(random > 0)
        {
            attackReference = Attack.SCRATCH;
        }
    }

   /** eats three times
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    {
       count = 0; 
       if(count < 3)
       {
         count++;
         generateMove();
         return true;
       }
       return false;
    }

   /** decide again what attack to use
    * @param String opponent 
    * @return Attack 
    * */
    @Override
    protected Attack fight(String opponent) 
    {
        generateAttack(); 
        if(opponent.equals("S")) 
        {
            if(isAwake() == false) 
            {
                return Attack.FORFEIT;
            }
            return Attack.ROAR;
        }
        return Attack.FORFEIT;
    }

   /** decide direction and attack upon win
    * @return void 
    **/
    @Override
    protected void win() 
    {
        generateMove();
        generateAttack();
    }

   /** decide attack upon mate
    * @return void 
    * */
    @Override
    protected void mate() 
    {
        generateAttack();
    }

   /** decide direction to move
    * @return Direction 
    * */
    @Override
    protected Direction getMove()
    {
        return generateMove(); 
    }
}

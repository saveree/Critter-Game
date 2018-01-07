/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: Leopard.java
 */

import java.awt.*;
import java.util.Random;

/* This class implements the Leopard class */
public class Leopard extends Omnivore {
    
    protected int value; 
    public int confidence;
    protected Random rand;

    // Constructor: initialize the object.
    public Leopard() 
    {
        confidence = 10; 
        super.count = 0; 
        rand = new Random(2017);
        super.displayName = "Li";
        super.displayColor = Color.orange;
        value = 0;
    }

   /** increment confidence as win
    * @return void 
    **/
    @Override
    protected void win()
    {
        if(confidence < 10)
        {
            confidence++;
        }
    }

   /** decrement confidence as loss
    * @return void 
    * */ 
    @Override 
    protected void lose()
    {
        if(confidence > 0)
        {
            confidence--;
        }
    }

   /** move in square forever 
    * @return Direction 
    **/
    @Override
    protected Direction getMove() 
    {
        if(0 <= value && 5 > value)
        {
            value++;
           
            return Direction.SOUTH;
        }
        if(5 <= value && 10 > value) 
        {
            value++;
            
            return Direction.WEST;
        }
        if(10 <= value && 15 > value) 
        {
            value++;
            
            return Direction.NORTH;
        }
        if(15 <= value && 20 > value) 
        {
            value++;
            
            return Direction.EAST;
        }
        if(value == 20)
        {
            value = 0; 
            return Direction.SOUTH;
        } 
       return Direction.CENTER;
    }

    /** overrides eat method
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    {
        int r = rand.nextInt(100);
        if(confidence == 2)
        {
            if(r >=0 && r <=19) 
            {
                return true;
            }
            return false;
        }
        if(confidence*10 < r)
        {
            return false;
        }
        return true;
    }

   /** decide again what attack to use
    * @param String opponent 
    * @return Attack 
    * */
    @Override
    protected Attack fight(String opponent) 
    {
        if(displayName.equals("O") || confidence > 5)
        {
            return Attack.SCRATCH;
        }
        else if(confidence < 2) 
        {
            return Attack.FORFEIT;
        }
        else
        {
            return Attack.ROAR;
        }
    }
}

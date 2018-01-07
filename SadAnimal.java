/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: SadAnimal.java
 */

import java.awt.*;
import java.util.Random;

/* Partially implements an animal's characteristics. */
public class SadAnimal extends Critter {
    protected String displayName;
    protected Color displayColor;
    protected boolean hasEaten;
    protected int count;
    /*keeps track in eat() and getMove()*/
    protected int value; 
    //public static String string;

    // Constructor: initialize the object.
    public SadAnimal () 
    {
        displayName = ":-(";
        displayColor = Color.red;
        hasEaten = false;
        //string = "";
    }

    // Movement method of SadAnimal that takes in empty parameter
    // Returns a direction that the critter would move to
    @Override
    protected Direction getMove() 
    {
        if(value % 2 == 0) 
        {
            return Direction.WEST;
        }
        else
        {
            return Direction.SOUTH;
        }
    }

   /** overrides eat, eats everything 
    * @return boolean 
    **/
    @Override
    protected boolean eat() 
    {
        value++;
        return true;
    }

    /* This method tells the simulator what color I should be. */
    @Override
    protected Color getColor() {
        return this.displayColor;
    }

    // This method returns the string representation of SadAnimal
    @Override
    public String toString()
    {
        return this.displayName;
    }
}

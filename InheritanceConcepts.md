/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: InheritanceConcepts.md
 */

1. The method sayStuff() essentailly prints out "I am a Critter." every time it is called. Even if the method is not defined in each of the classes, it still calls it because Critter is the superclass of all these subclasses in the PSA. Because the superclass has this method, it will be called when the program runs, and will print out "I am a Critter." This doesn't affect other Critters, but will simply add this print statement. 

2. The fight behavior of SadAnimal is not overriden, or rewritten in the SadAnimal.java file itself. Hence, it inherits from Critter, the super class, since it says SadAnimal extends Critter. So, we have to refer to Critter's fight method, which returns Attack.FORFEIT.

3. When I overrode the getColor() method in HappyAnimal.java, it changed the color to Black. Before, when we got the color, it was blue. This happens beacuse color is protected, and we need to access it by using the get() method. Without the get method, we are not able to attain access and therefore cannot see the blue color of the HappyAnimal. 

4. Since it is a static variable, it is shared among the Critter classes. If anything is changed in this subclass, it is changed in all subclasses. This public static String could be accessed from subclasses directly, and could be changed as well. There is no need for a public static String variable in the SadAnimal class though, so it wouldn't come to use. 
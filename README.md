/*
 * @author Saveree Joshipura
 * 02/14/17
 * A13349228
 * cs8bwaph
 * FileName: README.md
 */

PART 5: Command Questions and Program Descriptions 

1. You can write cut -c5-13 foo

2. ArrayList<Critter> arrayList = new ArrayList<Critter>();

The Critter program holds all of the main information together. The other programs related to Critter, such as Leopard, GreenTurtle, etc. just override, or rewrite the parts (methods) that are taken from Critter. But ultimately, Critter holds the information for all of the programs that take information (or extend) from it. Some examples of what Critter has are instructions on a Critter eating, sleeping, attacking, or winning. The simulator is the space on which the game is executed. On the side, it provides a board on which critter is winning the game, and by how many points. Critter holds the programs together, while the simulator shows us how the game is put on. You can change the settings by doing something called overriding. Overriding is essentially rewriting a part of your code. If you don’t want the critter to eat a certain way, you can just type “@Override” right above, and with some other slight specifications you are able to completely ignore what is written in the Critter file and make it your own. 
Write a paragraph on how you tested your Critters. This section must be five to eight sentences long. Examples of your testing procedures might include what features of the Critter simulation you used to help you run your tests.

Testing the critters was not a simple task. We had to check each method, and make sure it is working as written in the description. For getMove() sometimes the critter would not move North, then west, but would move south, then east. I didn’t write separate code to test my program, but instead went step-by-step to check each method and what its function was. Once I ensured the method was working correctly, I moved on to the next part. I also ran the critter simulation (CritterMain.java) several times, to ensure my critter would win most of the time. It listed during the simulation how many points each critter would have. 




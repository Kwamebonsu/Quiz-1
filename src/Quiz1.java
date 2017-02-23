
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kitchener = new City();

        //create the stairs up
        new Wall(kitchener, 4, 2, Direction.WEST);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        new Wall(kitchener, 3, 3, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.NORTH);

        //create the stairs down
        new Wall(kitchener, 2, 5, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.EAST);
        new Wall(kitchener, 3, 6, Direction.NORTH);
        new Wall(kitchener, 3, 6, Direction.EAST);
        new Wall(kitchener, 4, 7, Direction.NORTH);
        new Wall(kitchener, 4, 7, Direction.EAST);

        //create things
        new Thing(kitchener, 4, 1);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 1, 4);

        //create a robot
        RobotSE karel = new RobotSE(kitchener, 4, 0, Direction.EAST);

        //move karel up the stairs
        //pick up all the things
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.move();

        //move karel down the stairs
        //put down all the things

        karel.putThing();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
    }
}

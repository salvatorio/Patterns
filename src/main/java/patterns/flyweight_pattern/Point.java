package patterns.flyweight_pattern;

/**
 * Created on 14. June. 16.
 *
 * @author Evgeniy
 */

public class Point implements Shape{

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : let's draw a point ");
    }
}

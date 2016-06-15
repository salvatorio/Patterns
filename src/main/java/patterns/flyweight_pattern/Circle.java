package patterns.flyweight_pattern;

/**
 * Created on 14. June. 16.
 *
 * @author Evgeniy
 */

public class Circle implements Shape{

    int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : let's draw a circle with a radius " + r);
    }
}

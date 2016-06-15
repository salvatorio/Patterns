package patterns.flyweight_pattern;

/**
 * Created on 14. June. 16.
 *
 * @author Evgeniy
 */

public class Square implements Shape{

    int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : let's draw a square with a side " + a);
    }
}

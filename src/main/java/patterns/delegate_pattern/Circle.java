package patterns.delegate_pattern;

/**
 * Created on 21. June. 16.
 *
 * @author Evgeniy
 */

public class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

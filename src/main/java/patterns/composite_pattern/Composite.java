package patterns.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 14. June. 16.
 *
 * method should call the draw method in all its components
 * method draw going through the list of components and calls their method draw
 *
 * if a component becomes composite - he will print a list of storing things
 *
 * composite must move through the array of its components and call their draw method
 *
 * @author Evgeniy
 */

public class Composite implements Shape{

    /**
     * for storing figures as well and possible other components
     */
    private List<Shape> components = new ArrayList<Shape>();

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component: components){
            component.draw();
        }
    }
}

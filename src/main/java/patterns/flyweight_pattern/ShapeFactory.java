package patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 14. June. 16.
 *
 * @author Evgeniy
 */

public class ShapeFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName){

        Shape shape = shapes.get(shapeName);
        if (shape == null){
            switch (shapeName){
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}

package patterns.delegate_pattern;

/**
 * Created on 21. June. 16.
 *
 * @author Evgeniy
 */

public class Painter {

    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void draw(){
        graphics.draw();
    }
}

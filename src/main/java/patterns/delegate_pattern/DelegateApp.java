package patterns.delegate_pattern;

/**
 * Created on 21. June. 16.
 *
 * @author Evgeniy
 */

public class DelegateApp {

    public static void main(String[] args) {

//        A a = new A();
//        a.f();

        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();

    }
}

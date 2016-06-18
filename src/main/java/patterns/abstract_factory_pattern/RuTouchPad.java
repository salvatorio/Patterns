package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public class RuTouchPad implements TouchPad {

    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Мы передвинулись на " + s + " пикселей. ");
    }
}

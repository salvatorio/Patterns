package patterns.abstract_factory_pattern;

/**
 * Created on 18. June. 16.
 *
 * @author Evgeniy
 */

public class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.print("Print.");
    }

    @Override
    public void println() {
        System.out.println("Print Line and move to the next line. ");
    }
}

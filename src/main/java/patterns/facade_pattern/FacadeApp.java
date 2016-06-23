package patterns.facade_pattern;

/**
 * Created on 22. June. 16.
 *
 * Facade - building. Hiding all inside difficult stuff
 *
 * @author Evgeniy
 */

public class FacadeApp {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.copy();
    }
}

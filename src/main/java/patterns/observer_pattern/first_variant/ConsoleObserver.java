package patterns.observer_pattern.first_variant;

/**
 * Created on 20. June. 16.
 *
 * @author Evgeniy
 */

public class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Weather was changed. Temperature = " + temp
                + ", Pressure = " + presser + ".");
    }
}

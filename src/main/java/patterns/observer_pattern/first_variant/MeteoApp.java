package patterns.observer_pattern.first_variant;

/**
 * Created on 20. June. 16.
 *
 * @author Evgeniy
 */

public class MeteoApp {

    public static void main(String[] args) {

        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.addObserver(new FileObserver());

        station.setMeasurements(25, 760);
        station.setMeasurements(-5, 745);
    }
}

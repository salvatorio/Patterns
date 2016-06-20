package patterns.observer_pattern.first_variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 20. June. 16.
 * Observed object (we are looking from)
 *
 * @author Evgeniy
 */

public class MeteoStation implements Observed{

    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    /**
     * set state of temperature and pressure and notify all about changes
     * @param t
     * @param p
     */
    public void setMeasurements(int t, int p){
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.handleEvent(temperature, pressure);
        }
    }
}

package patterns.observer_pattern.first_variant;

/**
 * Created on 20. June. 16.
 * add observer, remove observer and notify all observers about changes
 *
 * @author Evgeniy
 */

public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}

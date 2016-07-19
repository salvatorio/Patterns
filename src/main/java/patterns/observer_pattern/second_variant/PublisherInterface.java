package patterns.observer_pattern.second_variant;

import java.util.ArrayList;

/**
 * Created on 20. June. 16.
 *
 * @author Evgeniy
 */

public interface PublisherInterface {

    public ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    void removeListener(PublisherActionListener listener);

    void removeAllListeners();

    void notifySubscribers(String message);

}

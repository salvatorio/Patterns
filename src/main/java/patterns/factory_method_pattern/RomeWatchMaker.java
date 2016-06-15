package patterns.factory_method_pattern;

/**
 * Created on 15. June. 16.
 *
 * @author Evgeniy
 */

public class RomeWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}

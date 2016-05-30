package patterns.strategy_pattern;

/**
 * Created on 27. 05. 16.
 */

// Context
public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] array){
        strategy.sort(array);
    }
}

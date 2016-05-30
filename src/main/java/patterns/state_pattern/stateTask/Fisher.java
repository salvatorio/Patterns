package patterns.state_pattern.stateTask;

/**
 * Created on 25.05.2016.
 */

public class Fisher implements HumanState {

    @Override
    public void changeRole(Human context) {
        System.out.println("Now I'm a Fisher!");
    }
}

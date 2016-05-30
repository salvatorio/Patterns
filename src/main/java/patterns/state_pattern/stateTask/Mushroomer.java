package patterns.state_pattern.stateTask;

/**
 * Created on 25.05.2016.
 */

public class Mushroomer implements HumanState {

    @Override
    public void changeRole(Human context) {
        System.out.println("Now I'm a Mushroomer!");
    }
}

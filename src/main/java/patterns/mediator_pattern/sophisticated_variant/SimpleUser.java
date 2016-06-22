package patterns.mediator_pattern.sophisticated_variant;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("Simple user " + getName() + " gets a message '" + message + "'");
    }
}

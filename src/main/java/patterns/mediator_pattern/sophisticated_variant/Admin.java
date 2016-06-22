package patterns.mediator_pattern.sophisticated_variant;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("ADMIN " + getName() + " gets a message '" + message + "'");
    }
}

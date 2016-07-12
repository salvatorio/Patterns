package patterns.mediator_pattern.simple_variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class TextChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User u){
        users.add(u);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users){
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}

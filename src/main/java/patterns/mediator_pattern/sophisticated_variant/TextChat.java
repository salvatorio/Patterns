package patterns.mediator_pattern.sophisticated_variant;

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

        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        }
        else {
            throw new RuntimeException("No enough rights!");
        }
    }

    public void addUser(User u){

        if (admin == null){
            throw new RuntimeException("No ADMIN in this chat!");
        }
        if (u instanceof SimpleUser){
            users.add(u);
        }
        else {
            throw new RuntimeException("ADMIN can't logging in different chats!");
        }
    }

    @Override
    public void sendMessage(String message, User user) {

        if (user instanceof Admin){
            for (User u : users){
                u.getMessage(user.getName() + ": " + message);
            }
        }
        if (user instanceof SimpleUser){
            for (User u : users){
                if (u != user && u.isEnable()){
                    u.getMessage(user.getName() + ": " + message);
                }
            }
            if (admin.isEnable()){
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}

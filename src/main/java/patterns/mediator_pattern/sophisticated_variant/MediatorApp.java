package patterns.mediator_pattern.sophisticated_variant;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class MediatorApp {

    public static void main(String[] args) {

        TextChat textChat = new TextChat();

        User admin = new Admin(textChat, "Ivan Ivanovich");
        User u1 = new SimpleUser(textChat, "Sasha");
        User u2 = new SimpleUser(textChat, "Vasya");
        User u3 = new SimpleUser(textChat, "Petya");
        u2.setEnable(false);

        textChat.setAdmin(admin);
        textChat.addUser(u1);
        textChat.addUser(u2);
        textChat.addUser(u3);

        admin.sendMessage("Hello world!");
    }
}

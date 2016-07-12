package patterns.mediator_pattern.simple_variant;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

public class SimpleUser implements User {

    private Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }


    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Simple user gets a message '" + message + "'");
    }
}

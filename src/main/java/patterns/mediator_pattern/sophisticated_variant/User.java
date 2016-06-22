package patterns.mediator_pattern.sophisticated_variant;

/**
 * Created on 22. June. 16.
 *
 * @author Evgeniy
 */

abstract class User {

    private Chat chat;
    private String name;
    private boolean isEnable = true;

    public boolean isEnable(){
        return isEnable;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        chat.sendMessage(message, this);
    }

    abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User name = '" + name + '\'';
    }
}

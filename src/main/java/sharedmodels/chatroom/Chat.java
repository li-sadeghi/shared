package sharedmodels.chatroom;


import sharedmodels.users.SharedUser;

import java.util.ArrayList;

public class Chat {
    private SharedUser sender;
    private SharedUser receiver;
    private ArrayList<Message> messages = new ArrayList<>();

    public Chat() {
    }

    public SharedUser getSender() {
        return sender;
    }

    public void setSender(SharedUser sender) {
        this.sender = sender;
    }

    public SharedUser getReceiver() {
        return receiver;
    }

    public void setReceiver(SharedUser receiver) {
        this.receiver = receiver;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}

package sharedmodels.chatroom;


import sharedmodels.users.SharedUser;

import java.util.ArrayList;

public class Chat {
    private String senderId;
    private String receiverId;
    private ArrayList<Message> messages = new ArrayList<>();

    public Chat() {
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}

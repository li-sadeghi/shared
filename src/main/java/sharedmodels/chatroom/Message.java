package sharedmodels.chatroom;

import sharedmodels.users.SharedUser;

import javax.persistence.*;

public class Message {
    private int id;
    private SharedUser sender;
    private SharedUser receiver;
    private String messageText;
    private MessageType messageType;

    public Message() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

package com.company;

import com.company.mediator.ChatMediator;
import com.company.mediator.ChatMediatorImpl;

import java.util.ArrayList;
import java.util.Date;

public class Chat {
    private int id;
    private ArrayList<Message> messages;
    private ArrayList<User> members;

    public Chat(ArrayList<Message> messages){
        this.messages = messages;
    }

    public Chat(ArrayList<Message> messages, ArrayList<User> members) {
        this.id = Random.generated();
        this.messages = messages;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }
}

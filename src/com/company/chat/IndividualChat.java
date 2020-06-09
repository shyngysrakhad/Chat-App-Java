package com.company.chat;

import com.company.Chat;
import com.company.Message;
import com.company.User;
import com.company.mediator.ChatMediator;
import com.company.mediator.ChatMediatorImpl;

import java.util.ArrayList;
import java.util.List;

public class IndividualChat extends Chat {
    private User user1;
    private User user2;
    ChatMediator mediator;
    public IndividualChat(ArrayList<Message> messages){
        super(messages);
        mediator = new ChatMediatorImpl();
    }

    public IndividualChat(ArrayList<Message> messages, User user1, User user2){
        super(messages);
        this.user1 = user1;
        this.user2 = user2;
        this.mediator = new ChatMediatorImpl();
        this.user1.setMediator(mediator);
        this.user2.setMediator(mediator);
        mediator.addUser(this.user1);
        mediator.addUser(this.user2);
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
        this.user1.setMediator(mediator);
        mediator.addUser(this.user1);
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
        this.user2.setMediator(mediator);
        mediator.addUser(this.user2);
    }
}

package com.company.mediator;

import com.company.Message;
import com.company.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message, User user) {
        for (User u: this.users){
            if (u != user){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}

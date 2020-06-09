package com.company.group_chat;

import com.company.User;
import com.company.mediator.ChatMediator;
import com.company.mediator.ChatMediatorImpl;

import java.util.List;

public class GroupChat {

    public GroupChat(List<User> users){
        ChatMediator mediator = new ChatMediatorImpl();
        for (User user: users){
            user.setMediator(mediator);
            mediator.addUser(user);
        }
    }
}

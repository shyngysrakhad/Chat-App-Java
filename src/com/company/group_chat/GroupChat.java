package com.company.group_chat;

import com.company.Chat;
import com.company.Message;
import com.company.User;
import com.company.mediator.ChatMediator;
import com.company.mediator.ChatMediatorImpl;

import java.util.ArrayList;

public class GroupChat extends Chat {

    public GroupChat(ArrayList<Message> messages, ArrayList<User> users){
        super(messages, users);
        ChatMediator mediator = new ChatMediatorImpl();
        for (User user: users){
            user.setMediator(mediator);
            mediator.addUser(user);
        }
    }
}

package com.company.chat;

import com.company.Message;
import com.company.user.Member;
import com.company.mediator.ChatMediator;
import com.company.mediator.ChatMediatorImpl;

import java.util.ArrayList;

public class GroupChat extends Chat {

    public GroupChat(ArrayList<Message> messages, ArrayList<Member> users){
        super(messages, users);
        ChatMediator mediator = new ChatMediatorImpl();
        for (Member user: users){
            user.setMediator(mediator);
            mediator.addUser(user);
        }
    }
}

package com.company.mediator;

import com.company.Message;
import com.company.user.Member;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<Member> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message, Member user) {
        for (Member u: this.users){
            if (u != user){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(Member user) {
        this.users.add(user);
    }
}

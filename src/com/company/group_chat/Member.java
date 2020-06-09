package com.company.group_chat;

import com.company.IMember;
import com.company.Message;
import com.company.User;

public class Member extends User implements IMember {
    public Member(String name) {
        super(name);
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println(this.getName() + ": sending message = " + message.toString());
        try {
            mediator.sendMessage(message, this);
        }catch (NullPointerException e){
            System.out.println("Mediator not found");
        }
    }

    @Override
    public void receiveMessage(Message message) {
        System.out.println(this.getName() + ": received message = " + message.toString());
    }
}

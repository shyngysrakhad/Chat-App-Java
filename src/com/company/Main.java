package com.company;

import com.company.chat.IndividualChat;
import com.company.group_chat.GroupChat;
import com.company.group_chat.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //Group chat
        Member user1 = new Member("Jobs");
        Member user2 = new Member("Shyngys");
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        Message message = new Message("HI");
        Message message2 = new Message("HI");
        ArrayList<Message> messages = new ArrayList<>();
        messages.add(message);
        messages.add(message2);
        new GroupChat(messages,list);

        //Individual chat
        User user3 = new Member("Shyngys");
        User user4 = new Member("Arman");
        ArrayList<Message> messages1 = new ArrayList<>();
        IndividualChat individualChat = new IndividualChat(messages1);
        individualChat.setUser1(user3);
        individualChat.setUser2(user4);
        user3.sendMessage(new Message("Hello"));
    }
}

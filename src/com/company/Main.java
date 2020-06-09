package com.company;

import com.company.group_chat.GroupChat;
import com.company.group_chat.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        //Group chat
        User user1 = new Member("Arman");
        User user2 = new Member("Shyngys");
        User user3 = new Member("Rakhad");
        User user4 = new Member("Erzhan");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        GroupChat groupChat = new GroupChat(users);
        user2.sendMessage(new Message("Hi"));

    }
}

package com.company.mediator;

import com.company.Message;
import com.company.user.Member;

public interface ChatMediator {
    void sendMessage(Message message, Member user);
    void addUser(Member user);
}

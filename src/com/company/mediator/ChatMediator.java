package com.company.mediator;

import com.company.Message;
import com.company.User;

public interface ChatMediator {
    void sendMessage(Message message, User user);
    void addUser(User user);
}

package com.company;

import com.company.mediator.ChatMediator;


public abstract class User{
    private int id;
    private String name;
    protected ChatMediator mediator;

    public User(String name){
        this.id = Random.generated();
        this.name = name;
    }
    public abstract void sendMessage(Message message);
    public abstract void receiveMessage(Message message);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatMediator getMediator() {
        return mediator;
    }

    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

}

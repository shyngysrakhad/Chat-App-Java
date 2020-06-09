package com.company;

import com.company.mediator.ChatMediator;

import java.sql.SQLException;

public class User implements IProfile{
    private int id;
    private String name;
    protected ChatMediator mediator;

    public User(String name){
        this.id = Random.generated();
        this.name = name;
    }

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

    @Override
    public void showFriends() {

    }

    @Override
    public void updateUsername(String username) throws SQLException {

    }

    @Override
    public void updatePassword(String password) throws SQLException {

    }

    @Override
    public void updateFirstName(String firstName) throws SQLException {

    }

    @Override
    public void updateLastName(String lastName) throws SQLException {

    }

    @Override
    public void addFriend(User friend) throws SQLException {

    }

    @Override
    public void deleteFriend(User friend) throws SQLException {

    }

    @Override
    public boolean isExistUser(String username) throws SQLException {
        return false;
    }

    @Override
    public boolean isFriend(User friend) throws SQLException {
        return false;
    }

    @Override
    public void sendMessage(Message message, User user) {

    }
}

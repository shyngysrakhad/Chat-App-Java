package com.company.user;

import com.company.*;
import com.company.mediator.ChatMediator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Member extends User implements IMember {

    public static Member getMember(String username, String password) throws SQLException {
        if (isCorrect(username, password)){
            String sql1 = "select * from project.user where username = '" + username + "' and password = '" + password + "'";
            String sql2 = "select * from project.friends f \n" +
                    "inner join project.user u1 on f.user_id_1 = u1.id\n" +
                    "inner join project.user u2 on f.user_id_2 = u2.id where u1.username = '" + username + "'";
            Statement statement = Database.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            String firstName = "", lastName = "";
            int id = -1;
            ArrayList<String> friends = new ArrayList<>();
            while (resultSet.next()){
                id = resultSet.getInt(1);
                firstName = resultSet.getString("firstName");
                lastName = resultSet.getString("lastName");
            }
            resultSet = statement.executeQuery(sql2);
            while (resultSet.next()){
                friends.add(resultSet.getString(11));
            }
            return new Member(id, username, password, firstName, lastName, friends);
        }else
            return new NullMember();
    }

    public Member(){
        super();
    }

    public Member(String username, String password){
        super(1, username, password, "Shyngys", "Rakhad", new ArrayList<>());
    }

    public Member(int id, String username, String password, String firstName, String lastName, ArrayList<String> friends) {
        super(id, username, password, firstName, lastName, friends);
    }

    public ChatMediator getMediator() {
        return mediator;
    }

    public void setMediator(ChatMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(Message message) {
        if (this instanceof NullMember){
            System.out.println("User not found");
            return;
        }
        message.setAuthor(this);
        System.out.println(this.getUsername() + ": sending message = " + message.toString());
        try {
            mediator.sendMessage(message, this);
        }catch (NullPointerException e){
            System.out.println("Mediator not found");
        }
    }

    @Override
    public void receiveMessage(Message message) {
        message.setAuthor(this);
        System.out.println(this.getUsername() + ": received message = " + message.toString());
    }
}

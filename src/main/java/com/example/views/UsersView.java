package com.example.views;

import com.example.core.User;
import com.yammer.dropwizard.views.View;

import java.util.List;

public class UsersView extends View {
    private final List<User> users;

    public UsersView(List<User> users) {
        super("Users.ftl");
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}

package com.data.ss3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class UserManager extends HttpServlet {
    private static List<User> users = new ArrayList<>();
    private static int userId = 1;

    public static void addUser(User user) {
        user.setId(userId++);
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void removeUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
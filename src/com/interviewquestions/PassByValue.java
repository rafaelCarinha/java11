package com.interviewquestions;

import com.model.User;

public class PassByValue {
    int $ = 5;

    static void modifyReference(User user) {
        user = new User("xxx", 1);
        user.setAge(11);
    }

    static void modifyValue(User user) {
        user.setAge(50);

    }

    public static void main(String[] args) {

        User user = new User("Bob", 18);

        modifyValue(user);
        System.out.println("User after value is modified: "+ user);

        modifyReference(user);
        System.out.println("User after trying to modify reference: "+ user);

    }

}

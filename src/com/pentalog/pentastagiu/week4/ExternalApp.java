package com.pentalog.pentastagiu.week4;

import com.pentalog.pentastagiu.week4.nested.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExternalApp {

    public static void main(String[] args) {
        // create User instances using the Builder nested class
        User.Builder builder = new User.Builder();
        User user = builder.withEmail("pentastagiu@pentalog.com")
                .withFirstName("Mimi")
                .withId(123)
                .build();
        System.out.println(user);

        User user2 = builder.withEmail("pentastagiu2@pentalog.com")
                .withFirstName("Lili")
                .withId(1)
                .build();

        User user3 = builder.withEmail("pentastagiu3@pentalog.com")
                .withFirstName("Vivi")
                .withId(66)
                .build();

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        System.out.println(users);

        // create an anonymous class that provides an implementation for compare, a method used to compare objects when sorting them
        Collections.sort(users, new Comparator<User>() {
            // uses id to compare two User instances and orders them in ascending order when used in a sort method
            @Override
            public int compare(User user, User t1) {
                return user.getId() - t1.getId();
            }
        });
        System.out.println("Sorted by id: " + users);

        // another anonymous class that is used to sort objects in collection alphabetically by firstName
        Collections.sort(users, new Comparator<User>() {
            // uses firstName to compare two User instances and orders them in alphabetical order when used in a sort method
            @Override
            public int compare(User user, User t1) {
                return user.getFirstName().compareTo(t1.getFirstName());
            }
        });
        System.out.println("Sorted by firstName: " + users);

    }
}

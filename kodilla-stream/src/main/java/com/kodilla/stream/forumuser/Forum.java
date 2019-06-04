package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1,1, "Wick", 'M', LocalDate.of(1995, 11, 25)));
        usersList.add(new ForumUser(2,325, "You", 'F', LocalDate.of(1995, 12, 13)));
        usersList.add(new ForumUser(3,621, "Know", 'M', LocalDate.of(1974, 11, 25)));
        usersList.add(new ForumUser(4,63, "Nothing", 'F', LocalDate.of(1999, 11, 25)));
        usersList.add(new ForumUser(5,123, "John", 'M', LocalDate.of(1984, 11, 25)));
        usersList.add(new ForumUser(6,73, "Snow", 'F', LocalDate.of(2012, 11, 25)));
        usersList.add(new ForumUser(7,34244, "Ya", 'M', LocalDate.of(1942, 11, 25)));
        usersList.add(new ForumUser(8,462, "Bastard", 'F', LocalDate.of(2003, 11, 25)));
        usersList.add(new ForumUser(9,7, "Son", 'M', LocalDate.of(2000, 11, 25)));

    }


    public List<ForumUser> getUsersList(){
        return usersList;
    }
}

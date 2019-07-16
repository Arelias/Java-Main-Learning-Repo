package com.kodilla.good.patterns.challenges.two.listings.elements.user;

import com.kodilla.good.patterns.challenges.two.repositories.user.UserRepository;

public interface SessionProcessor {

    public User userLogIn(String username, String password, UserRepository userRepository);
    public void userLogOut(User user);

}

package com.kodilla.good.patterns.challenges.two.repositories.user;

import com.kodilla.good.patterns.challenges.two.listings.elements.user.User;

import java.util.Optional;

public class UserRepositorySQL implements UserRepository {
    @Override
    public boolean registerUser(String email, String useername, String password) {
        return false;
    }

    @Override
    public Optional<User> getUser(String username, String password) {
        return Optional.empty();
    }
}

package com.kodilla.good.patterns.challenges.two.repositories.user;

import com.kodilla.good.patterns.challenges.two.user.User;
import java.util.Optional;


public interface UserRepository {

    boolean registerUser(String email, String useername, String password);
    Optional<User> getUser(String username, String password);

}

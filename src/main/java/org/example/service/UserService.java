package org.example.service;

import org.example.entity.User;

public interface UserService {
    User findUser(String username, String password);

}

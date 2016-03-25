package ru.kpfu.itis.service;


import ru.kpfu.itis.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

}

package com.konar.pp3_1_1.dao;


import com.konar.pp3_1_1.entity.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
    User getUserById(long id);
    void updateUser(User user);
    void deleteUser(long id);
}

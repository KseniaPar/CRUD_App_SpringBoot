package ru.parpulova.crud_app_springboot.dao;


import ru.parpulova.crud_app_springboot.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    User findUserById(long id);
    void updateUser(User user);
    void deleteUserById(long id);
    List<User> showAllUsers();

}

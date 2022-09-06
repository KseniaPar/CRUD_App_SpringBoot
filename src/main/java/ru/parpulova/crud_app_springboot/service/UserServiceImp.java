package ru.parpulova.crud_app_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.parpulova.crud_app_springboot.dao.UserDAO;
import ru.parpulova.crud_app_springboot.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) { this.userDAO = userDAO; }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User findUserById(long id) {
        return userDAO.findUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

    @Override
    public List<User> showAllUsers() {
        return userDAO.showAllUsers();
    }
}

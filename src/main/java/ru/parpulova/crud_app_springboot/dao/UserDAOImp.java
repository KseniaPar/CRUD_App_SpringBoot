package ru.parpulova.crud_app_springboot.dao;

import org.springframework.stereotype.Repository;
import ru.parpulova.crud_app_springboot.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class  UserDAOImp implements UserDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public User findUserById(long id) {
        return em.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUserById(long id) {
        User user = findUserById(id);
        em.remove(user);
    }

    @Override
    public List<User> showAllUsers() {
        return em.createQuery("select user from User user", User.class)
                .getResultList();
    }
}

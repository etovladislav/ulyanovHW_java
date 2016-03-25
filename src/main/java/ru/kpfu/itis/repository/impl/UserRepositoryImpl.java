package ru.kpfu.itis.repository.impl;


import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<User> getAllUsers() {
        Query query = em.createNativeQuery("SELECT * FROM users", User.class);
        return query.getResultList();
    }

    @Override
    public User findUserByLogin(String login) {
        Query query = em.createNativeQuery("SELECT * from users where login = ?;", User.class);
        query.setParameter(1, login);
        return (User) query.getSingleResult();
    }

    @Override
    public User findUserById(Long id) {
        Query query = em.createNativeQuery("SELECT * from users where id = ?;", User.class);
        query.setParameter(1, id);
        return (User) query.getSingleResult();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        em.persist(user);
        user.setName("Oleg");
    }
}

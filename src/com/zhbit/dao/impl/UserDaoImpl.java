package com.zhbit.dao.impl;

import com.zhbit.dao.UserDao;
import com.zhbit.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(User.class, id));
    }

    @Override
    public User getUser(Integer id) {
        return (User) sessionFactory.getCurrentSession().get(User.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsertList(){
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public User getUserByUsername(String username) {
        return (User)sessionFactory.getCurrentSession().createQuery("from User where username=:username").setParameter("username", username).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

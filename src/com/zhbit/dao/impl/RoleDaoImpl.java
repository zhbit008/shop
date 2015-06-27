package com.zhbit.dao.impl;

import com.zhbit.dao.RoleDao;
import com.zhbit.domain.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Role role) {
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public void update(Role role) {
        sessionFactory.getCurrentSession().update(role);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Role.class,id));
    }

    @Override
    public Role getRole(Integer id) {
        return (Role)sessionFactory.getCurrentSession().get(Role.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Role> getRoleList() {
        return sessionFactory.getCurrentSession().createQuery("from Role").list();
    }

    @Override
    public Role getRoleByRolename(String rolename) {
        return (Role)sessionFactory.getCurrentSession().createQuery("from Role where rolename=:rolename").setParameter("rolename",rolename).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

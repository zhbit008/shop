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

    }

    @Override
    public void update(Role role) {

    }

    @Override
    public void delete(Integer roleId) {

    }

    @Override
    public Role getRole(Integer roleId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Role> getRoleList() {
        return null;
    }

    @Override
    public Role getRoleByRolename(String rolename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

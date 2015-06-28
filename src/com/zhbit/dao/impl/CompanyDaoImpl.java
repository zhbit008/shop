package com.zhbit.dao.impl;

import com.zhbit.dao.CompanyDao;
import com.zhbit.domain.Company;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Repository("companyDao")
public class CompanyDaoImpl implements CompanyDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Company company) {
        sessionFactory.getCurrentSession().save(company);
    }

    @Override
    public void update(Company company) {
        sessionFactory.getCurrentSession().update(company);
    }

    @Override
    public void delete(Integer companyId) {
        sessionFactory.getCurrentSession().load(Company.class,companyId);
    }

    @Override
    public Company getCompany(Integer companyId) {
        return (Company)sessionFactory.getCurrentSession().get(Company.class,companyId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Company> getCompanyList() {
        return sessionFactory.getCurrentSession().createQuery("from Company").list();
    }

    @Override
    public Company getCompanyByCompanyname(String companyname) {
        return (Company)sessionFactory.getCurrentSession().createQuery("from Company where companyname=:companyname").setParameter("companyname",companyname).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

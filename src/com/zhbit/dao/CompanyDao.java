package com.zhbit.dao;

import com.zhbit.domain.Company;

import java.util.List;
/**
 * Created by acer on 2015/6/27.
 */
public interface CompanyDao {
    public void save(Company company);
    public void update(Company company);
    public void delete(Integer companyId);
    public Company getCompany(Integer companyId);
    public List<Company> getCompanyList();
    public Company getCompanyByCompanyname(String companyname);
}

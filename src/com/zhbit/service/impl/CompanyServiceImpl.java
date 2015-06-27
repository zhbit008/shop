package com.zhbit.service.impl;


import com.zhbit.dao.CompanyDao;
import com.zhbit.domain.Company;
import com.zhbit.service.CompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{
    @Resource
    private CompanyDao companyDao;


    @Override
    public void addCompany(Company company) {
        companyDao.save(company);
    }

//    public void setCompanyDao(CompanyDao companyDao) {
//        this.companyDao = companyDao;
//    }
//    public CompanyDao getCompanyDao() {
//        return companyDao;
//    }
}

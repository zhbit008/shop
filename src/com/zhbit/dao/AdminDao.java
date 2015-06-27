package com.zhbit.dao;

import com.zhbit.domain.Admin;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface AdminDao {
    public void save(Admin admin);
    public void update(Admin admin);
    public void delete(Integer adminId);
    public Admin getAdmin(Integer adminId);
    public List<Admin> getAdminList();
    public Admin getAdminByAdminname(String adminname);
}

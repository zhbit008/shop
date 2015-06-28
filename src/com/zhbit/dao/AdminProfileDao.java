package com.zhbit.dao;

import com.zhbit.domain.AdminProfile;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface AdminProfileDao {
    public void save(AdminProfile adminprofile);
    public void update(AdminProfile adminprofile);
    public void delete(Integer adminprofileId);
    public AdminProfile getAdminProfile(Integer adminprofileId);
    public List<AdminProfile> getAdminProfileList();
    public AdminProfile getAdminProfileBykey(String key);
}

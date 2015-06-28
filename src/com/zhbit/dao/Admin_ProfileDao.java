package com.zhbit.dao;

import com.zhbit.domain.Admin_Profile;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface Admin_ProfileDao {
    public void save(Admin_Profile admin_profile);
    public void update(Admin_Profile admin_profile);
    public void delete(Integer admin_profileId);
    public Admin_Profile getAdmin_Profile(Integer admin_profileId);
    public List<Admin_Profile> getAdmin_ProfileList();
    public Admin_Profile getAdmin_ProfileBykey(String key);
}

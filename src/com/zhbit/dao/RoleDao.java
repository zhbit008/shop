package com.zhbit.dao;

import com.zhbit.domain.Role;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface RoleDao {
    public void save(Role role);
    public void update(Role role);
    public void delete(Integer roleId);
    public Role getRole(Integer roleId);
    public List<Role> getRoleList();
    public Role getRoleByRolename(String rolename);
}

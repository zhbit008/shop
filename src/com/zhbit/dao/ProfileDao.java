package com.zhbit.dao;

import com.zhbit.domain.Profile;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ProfileDao {
    public void save(Profile profile);
    public void update(Profile profile);
    public void delete(Integer profileId);
    public Profile getProfile(Integer profileId);
    public List<Profile> getProfileList();
    public Profile getProfileByProfilename(String profilename);
}

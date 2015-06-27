package com.zhbit.dao;

import com.zhbit.domain.Company;
import com.zhbit.domain.Favorite;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface FavoriteDao {
    public void save(Favorite favorite);
    public void update(Favorite favorite);
    public void delete(Integer favoriteId);
    public Favorite getFavorite(Integer favoriteId);
    public List<Favorite> getFavoriteList();
    public Favorite getFavoriteByFavoritename(String favoritename);
}

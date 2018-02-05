package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.CategoryService;
import com.league.dal.shop.dao.CategoryDao;
import com.league.dal.shop.domain.CategoryDO;

import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public CategoryDO get(Long id) {
        return categoryDao.get(id);
    }

    @Override
    public List<CategoryDO> list(Map<String, Object> map) {
        return categoryDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return categoryDao.count(map);
    }

    @Override
    public int save(CategoryDO category) {
        return categoryDao.save(category);
    }

    @Override
    public int update(CategoryDO category) {
        return categoryDao.update(category);
    }

    @Override
    public int remove(Long id) {
        return categoryDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return categoryDao.batchRemove(ids);
    }

}

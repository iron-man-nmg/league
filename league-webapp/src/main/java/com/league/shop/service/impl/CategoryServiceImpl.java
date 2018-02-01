package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.CategoryDao;
import com.league.shop.domain.CategoryDO;
import com.league.shop.service.CategoryService;

import java.util.List;
import java.util.Map;



@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public CategoryDO get(Long id){
		return categoryDao.get(id);
	}
	
	@Override
	public List<CategoryDO> list(Map<String, Object> map){
		return categoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return categoryDao.count(map);
	}
	
	@Override
	public int save(CategoryDO category){
		return categoryDao.save(category);
	}
	
	@Override
	public int update(CategoryDO category){
		return categoryDao.update(category);
	}
	
	@Override
	public int remove(Long id){
		return categoryDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return categoryDao.batchRemove(ids);
	}
	
}

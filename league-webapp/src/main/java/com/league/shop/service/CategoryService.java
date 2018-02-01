package com.league.shop.service;

import java.util.List;
import java.util.Map;

import com.league.shop.domain.CategoryDO;

/**
 * 商品分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface CategoryService {
	
	CategoryDO get(Long id);
	
	List<CategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CategoryDO category);
	
	int update(CategoryDO category);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
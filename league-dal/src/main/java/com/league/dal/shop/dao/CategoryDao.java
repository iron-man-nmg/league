package com.league.dal.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.shop.domain.CategoryDO;

/**
 * 商品分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface CategoryDao {

    CategoryDO get(Long id);

    List<CategoryDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(CategoryDO category);

    int update(CategoryDO category);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

package com.league.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.shop.domain.ManagerDO;

/**
 * 管理员表
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface ManagerDao {

	ManagerDO get(Long id);
	
	List<ManagerDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ManagerDO manager);
	
	int update(ManagerDO manager);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

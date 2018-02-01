package com.league.shop.service;

import java.util.List;
import java.util.Map;

import com.league.shop.domain.ManagerDO;

/**
 * 管理员表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface ManagerService {
	
	ManagerDO get(Long id);
	
	List<ManagerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ManagerDO manager);
	
	int update(ManagerDO manager);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

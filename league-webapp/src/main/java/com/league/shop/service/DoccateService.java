package com.league.shop.service;

import java.util.List;
import java.util.Map;

import com.league.shop.domain.DoccateDO;

/**
 * 信息分类表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface DoccateService {
	
	DoccateDO get(Long id);
	
	List<DoccateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DoccateDO doccate);
	
	int update(DoccateDO doccate);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

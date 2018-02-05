package com.league.admin.service.shop;

import java.util.List;
import java.util.Map;

import com.league.dal.shop.domain.GstypeDO;

/**
 * 商品类型
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface GstypeService {
	
	GstypeDO get(Long id);
	
	List<GstypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GstypeDO gstype);
	
	int update(GstypeDO gstype);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

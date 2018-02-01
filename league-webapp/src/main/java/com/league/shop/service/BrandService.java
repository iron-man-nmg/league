package com.league.shop.service;

import java.util.List;
import java.util.Map;

import com.league.shop.domain.BrandDO;

/**
 * 品牌表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface BrandService {
	
	BrandDO get(Long id);
	
	List<BrandDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(BrandDO brand);
	
	int update(BrandDO brand);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

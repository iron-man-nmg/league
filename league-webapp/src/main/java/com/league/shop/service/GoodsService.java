package com.league.shop.service;

import java.util.List;
import java.util.Map;

import com.league.shop.domain.GoodsDO;

/**
 * 商品表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
public interface GoodsService {
	
	GoodsDO get(Long id);
	
	List<GoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GoodsDO goods);
	
	int update(GoodsDO goods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

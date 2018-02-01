package com.league.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.shop.domain.DocumentDO;

/**
 * 文档表
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface DocumentDao {

	DocumentDO get(Long id);
	
	List<DocumentDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(DocumentDO document);
	
	int update(DocumentDO document);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

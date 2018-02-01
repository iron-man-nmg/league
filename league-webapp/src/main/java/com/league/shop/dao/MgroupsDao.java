package com.league.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.shop.domain.MgroupsDO;

/**
 * 管理员组
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface MgroupsDao {

	MgroupsDO get(Long id);
	
	List<MgroupsDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(MgroupsDO mgroups);
	
	int update(MgroupsDO mgroups);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

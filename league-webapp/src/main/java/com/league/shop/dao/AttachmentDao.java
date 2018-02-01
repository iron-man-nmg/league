package com.league.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.shop.domain.AttachmentDO;

/**
 * 附件表
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface AttachmentDao {

	AttachmentDO get(Long id);
	
	List<AttachmentDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(AttachmentDO attachment);
	
	int update(AttachmentDO attachment);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}

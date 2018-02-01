package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.GstypeDao;
import com.league.shop.domain.GstypeDO;
import com.league.shop.service.GstypeService;

import java.util.List;
import java.util.Map;



@Service
public class GstypeServiceImpl implements GstypeService {
	@Autowired
	private GstypeDao gstypeDao;
	
	@Override
	public GstypeDO get(Long id){
		return gstypeDao.get(id);
	}
	
	@Override
	public List<GstypeDO> list(Map<String, Object> map){
		return gstypeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return gstypeDao.count(map);
	}
	
	@Override
	public int save(GstypeDO gstype){
		return gstypeDao.save(gstype);
	}
	
	@Override
	public int update(GstypeDO gstype){
		return gstypeDao.update(gstype);
	}
	
	@Override
	public int remove(Long id){
		return gstypeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return gstypeDao.batchRemove(ids);
	}
	
}

package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.DoccateDao;
import com.league.shop.domain.DoccateDO;
import com.league.shop.service.DoccateService;

import java.util.List;
import java.util.Map;



@Service
public class DoccateServiceImpl implements DoccateService {
	@Autowired
	private DoccateDao doccateDao;
	
	@Override
	public DoccateDO get(Long id){
		return doccateDao.get(id);
	}
	
	@Override
	public List<DoccateDO> list(Map<String, Object> map){
		return doccateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return doccateDao.count(map);
	}
	
	@Override
	public int save(DoccateDO doccate){
		return doccateDao.save(doccate);
	}
	
	@Override
	public int update(DoccateDO doccate){
		return doccateDao.update(doccate);
	}
	
	@Override
	public int remove(Long id){
		return doccateDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return doccateDao.batchRemove(ids);
	}
	
}

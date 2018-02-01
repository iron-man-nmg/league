package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.BrandDao;
import com.league.shop.domain.BrandDO;
import com.league.shop.service.BrandService;

import java.util.List;
import java.util.Map;



@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDao brandDao;
	
	@Override
	public BrandDO get(Long id){
		return brandDao.get(id);
	}
	
	@Override
	public List<BrandDO> list(Map<String, Object> map){
		return brandDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return brandDao.count(map);
	}
	
	@Override
	public int save(BrandDO brand){
		return brandDao.save(brand);
	}
	
	@Override
	public int update(BrandDO brand){
		return brandDao.update(brand);
	}
	
	@Override
	public int remove(Long id){
		return brandDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return brandDao.batchRemove(ids);
	}
	
}

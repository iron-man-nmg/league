package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.LocaleDao;
import com.league.shop.domain.LocaleDO;
import com.league.shop.service.LocaleService;

import java.util.List;
import java.util.Map;



@Service
public class LocaleServiceImpl implements LocaleService {
	@Autowired
	private LocaleDao localeDao;
	
	@Override
	public LocaleDO get(Long id){
		return localeDao.get(id);
	}
	
	@Override
	public List<LocaleDO> list(Map<String, Object> map){
		return localeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return localeDao.count(map);
	}
	
	@Override
	public int save(LocaleDO locale){
		return localeDao.save(locale);
	}
	
	@Override
	public int update(LocaleDO locale){
		return localeDao.update(locale);
	}
	
	@Override
	public int remove(Long id){
		return localeDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return localeDao.batchRemove(ids);
	}
	
}

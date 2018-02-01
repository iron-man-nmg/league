package com.league.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.shop.dao.DocumentDao;
import com.league.shop.domain.DocumentDO;
import com.league.shop.service.DocumentService;

import java.util.List;
import java.util.Map;



@Service
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	private DocumentDao documentDao;
	
	@Override
	public DocumentDO get(Long id){
		return documentDao.get(id);
	}
	
	@Override
	public List<DocumentDO> list(Map<String, Object> map){
		return documentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return documentDao.count(map);
	}
	
	@Override
	public int save(DocumentDO document){
		return documentDao.save(document);
	}
	
	@Override
	public int update(DocumentDO document){
		return documentDao.update(document);
	}
	
	@Override
	public int remove(Long id){
		return documentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return documentDao.batchRemove(ids);
	}
	
}

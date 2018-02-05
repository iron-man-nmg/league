package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.DoccateService;
import com.league.dal.shop.dao.DoccateDao;
import com.league.dal.shop.domain.DoccateDO;

import java.util.List;
import java.util.Map;

@Service
public class DoccateServiceImpl implements DoccateService {

    @Autowired
    private DoccateDao doccateDao;

    @Override
    public DoccateDO get(Long id) {
        return doccateDao.get(id);
    }

    @Override
    public List<DoccateDO> list(Map<String, Object> map) {
        return doccateDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return doccateDao.count(map);
    }

    @Override
    public int save(DoccateDO doccate) {
        return doccateDao.save(doccate);
    }

    @Override
    public int update(DoccateDO doccate) {
        return doccateDao.update(doccate);
    }

    @Override
    public int remove(Long id) {
        return doccateDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return doccateDao.batchRemove(ids);
    }

}

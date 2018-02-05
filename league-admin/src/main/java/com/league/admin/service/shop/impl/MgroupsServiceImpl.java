package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.MgroupsService;
import com.league.dal.shop.dao.MgroupsDao;
import com.league.dal.shop.domain.MgroupsDO;

import java.util.List;
import java.util.Map;

@Service
public class MgroupsServiceImpl implements MgroupsService {

    @Autowired
    private MgroupsDao mgroupsDao;

    @Override
    public MgroupsDO get(Long id) {
        return mgroupsDao.get(id);
    }

    @Override
    public List<MgroupsDO> list(Map<String, Object> map) {
        return mgroupsDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return mgroupsDao.count(map);
    }

    @Override
    public int save(MgroupsDO mgroups) {
        return mgroupsDao.save(mgroups);
    }

    @Override
    public int update(MgroupsDO mgroups) {
        return mgroupsDao.update(mgroups);
    }

    @Override
    public int remove(Long id) {
        return mgroupsDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return mgroupsDao.batchRemove(ids);
    }

}

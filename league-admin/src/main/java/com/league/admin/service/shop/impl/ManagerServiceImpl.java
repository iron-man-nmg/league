package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.ManagerService;
import com.league.dal.shop.dao.ManagerDao;
import com.league.dal.shop.domain.ManagerDO;

import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;

    @Override
    public ManagerDO get(Long id) {
        return managerDao.get(id);
    }

    @Override
    public List<ManagerDO> list(Map<String, Object> map) {
        return managerDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return managerDao.count(map);
    }

    @Override
    public int save(ManagerDO manager) {
        return managerDao.save(manager);
    }

    @Override
    public int update(ManagerDO manager) {
        return managerDao.update(manager);
    }

    @Override
    public int remove(Long id) {
        return managerDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return managerDao.batchRemove(ids);
    }

}

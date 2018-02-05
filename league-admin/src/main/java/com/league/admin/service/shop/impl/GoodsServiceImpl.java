package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.GoodsService;
import com.league.dal.shop.dao.GoodsDao;
import com.league.dal.shop.domain.GoodsDO;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public GoodsDO get(Long id) {
        return goodsDao.get(id);
    }

    @Override
    public List<GoodsDO> list(Map<String, Object> map) {
        return goodsDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return goodsDao.count(map);
    }

    @Override
    public int save(GoodsDO goods) {
        return goodsDao.save(goods);
    }

    @Override
    public int update(GoodsDO goods) {
        return goodsDao.update(goods);
    }

    @Override
    public int remove(Long id) {
        return goodsDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return goodsDao.batchRemove(ids);
    }

}

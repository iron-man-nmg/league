package com.league.admin.service.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.admin.service.shop.AttachmentService;
import com.league.dal.shop.dao.AttachmentDao;
import com.league.dal.shop.domain.AttachmentDO;

import java.util.List;
import java.util.Map;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentDao attachmentDao;

    @Override
    public AttachmentDO get(Long id) {
        return attachmentDao.get(id);
    }

    @Override
    public List<AttachmentDO> list(Map<String, Object> map) {
        return attachmentDao.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return attachmentDao.count(map);
    }

    @Override
    public int save(AttachmentDO attachment) {
        return attachmentDao.save(attachment);
    }

    @Override
    public int update(AttachmentDO attachment) {
        return attachmentDao.update(attachment);
    }

    @Override
    public int remove(Long id) {
        return attachmentDao.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids) {
        return attachmentDao.batchRemove(ids);
    }

}

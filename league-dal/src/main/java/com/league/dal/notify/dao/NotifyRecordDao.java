package com.league.dal.notify.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.notify.domain.NotifyRecordDO;

/**
 * 类NotifyRecordDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:55:43
 */
@Mapper
public interface NotifyRecordDao {

    NotifyRecordDO get(Long id);

    List<NotifyRecordDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(NotifyRecordDO notifyRecord);

    int update(NotifyRecordDO notifyRecord);

    int remove(Long id);

    int batchRemove(Long[] ids);

    int batchSave(List<NotifyRecordDO> records);

    Long[] listNotifyIds(Map<String, Object> map);

    int removeByNotifbyId(Long notifyId);

    int batchRemoveByNotifbyId(Long[] notifyIds);

    int changeRead(NotifyRecordDO notifyRecord);
}

package com.league.dal.notify.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.notify.domain.NotifyDO;
import com.league.dal.notify.domain.NotifyDTO;

/**
 * 类NotifyDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:55:19
 */
@Mapper
public interface NotifyDao {

    NotifyDO get(Long id);

    List<NotifyDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(NotifyDO notify);

    int update(NotifyDO notify);

    int remove(Long id);

    int batchRemove(Long[] ids);

    List<NotifyDO> listByIds(Long[] ids);

    int countDTO(Map<String, Object> map);

    List<NotifyDTO> listDTO(Map<String, Object> map);
}

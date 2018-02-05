package com.league.dal.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.common.domain.LogDO;

/**
 * 类LogDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:53:25
 */
@Mapper
public interface LogDao {

    LogDO get(Long id);

    List<LogDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(LogDO log);

    int update(LogDO log);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

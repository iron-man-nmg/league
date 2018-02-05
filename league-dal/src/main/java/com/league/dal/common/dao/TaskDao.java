package com.league.dal.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.common.domain.TaskDO;

/**
 * 类TaskDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:53:48
 */
@Mapper
public interface TaskDao {

    TaskDO get(Long id);

    List<TaskDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(TaskDO task);

    int update(TaskDO task);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

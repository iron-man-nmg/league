package com.league.dal.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.league.dal.common.domain.FileDO;

/**
 * 类FileDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:52:36
 */
@Mapper
public interface FileDao {

    FileDO get(Long id);

    List<FileDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(FileDO file);

    int update(FileDO file);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

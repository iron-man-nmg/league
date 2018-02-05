package com.league.dal.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.common.domain.DictDO;

/**
 * 类DictDao.java的实现描述：TODO 类实现描述
 * @author wanglei 2018年2月5日 下午3:52:25
 */
@Mapper
public interface DictDao {

    DictDO get(Long id);

    List<DictDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(DictDO dict);

    int update(DictDO dict);

    int remove(Long id);

    int batchRemove(Long[] ids);

    List<DictDO> listType();
}

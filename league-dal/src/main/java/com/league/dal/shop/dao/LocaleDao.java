package com.league.dal.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.league.dal.shop.domain.LocaleDO;

/**
 * 语言表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */
@Mapper
public interface LocaleDao {

    LocaleDO get(Long id);

    List<LocaleDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(LocaleDO locale);

    int update(LocaleDO locale);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

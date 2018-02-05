package com.league.admin.service.common;

import org.springframework.stereotype.Service;

import com.league.common.utils.Query;
import com.league.dal.common.domain.LogDO;
import com.league.dal.common.domain.PageDO;

@Service
public interface LogService {

    PageDO<LogDO> queryList(Query query);

    int remove(Long id);

    int batchRemove(Long[] ids);
}

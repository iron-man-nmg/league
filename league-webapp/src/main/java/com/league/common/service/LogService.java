package com.league.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.league.common.domain.LogDO;
import com.league.common.domain.PageDO;
import com.league.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}

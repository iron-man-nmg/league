package com.league.admin.service.userrole;

import java.util.Collection;
import java.util.List;

import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import com.league.dal.userrole.domain.UserDO;
import com.league.dal.userrole.domain.UserOnline;

@Service
public interface SessionService {

    List<UserOnline> list();

    List<UserDO> listOnlineUser();

    Collection<Session> sessionList();

    boolean forceLogout(String sessionId);
}

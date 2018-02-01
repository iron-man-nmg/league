package com.league.common.controller;

import org.springframework.stereotype.Controller;

import com.league.common.utils.ShiroUtils;
import com.league.system.domain.UserDO;
import com.league.system.domain.UserToken;

@Controller
public class BaseController {

    public UserDO getUser() {
        return ShiroUtils.getUser();
    }

    public Long getUserId() {
        return getUser().getUserId();
    }

    public String getUsername() {
        return getUser().getUsername();
    }
}

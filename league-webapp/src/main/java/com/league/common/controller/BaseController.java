package com.league.common.controller;

import org.springframework.stereotype.Controller;

import com.league.common.utils.ShiroUtils;
import com.league.system.domain.UserDO;

@Controller
public class BaseController {

    protected static String SUCCESS  = "SUCCESS";
    protected static String ERROR    = "ERROR";

    protected static String REDIRECT = "redirect:";
    protected static String FORWARD  = "forward:";

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

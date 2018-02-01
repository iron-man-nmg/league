package com.league.shop.controller.publics;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商品表
 * 
 * @author wanglei
 * @email sky_hilo2@163.com
 * @date 2018-01-31 20:05:30
 */

@Controller
@RequestMapping("/shop/publics")
public class ShopController {

    /**
     * 跳转到主页
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String shopIndex(Model model) {
        return "/shop/publics/index-shop";
    }

    /**
     * 商品详情
     */
    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String goodsDetail(Model model) {
        return "/shop/publics/shop-product";
    }

}

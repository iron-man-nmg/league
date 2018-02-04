package com.league;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ServletComponentScan 使用代码注册bean时不需要增加此注解
 * springboot自定义serlvet，filter，listener时使用@WebServlet、@WebFilter、@WebListener注解自动注册
 * 
 * @EnableTransactionManagement 开启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
 * 代码中使用@Transactional进行事务控制
 * 
 * 类LeagueApplication.java的实现描述：TODO 类实现描述 
 * @author wanglei 2018年2月2日 上午9:51:27
 */
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.league.*.dao")
@SpringBootApplication
public class LeagueApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeagueApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    league启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }


}

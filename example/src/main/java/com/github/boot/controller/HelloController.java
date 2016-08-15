package com.github.boot.controller;

import com.github.boot.service.JdbcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by mwjsolar on 16/8/13.
 */
@Controller
public class HelloController {

    @Resource
    private  JdbcService jdbcService;


    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping("/sql")
    @ResponseBody
    public String executeSQL(String sql) {
        if (StringUtils.isEmpty(sql))
            return "sql is empty";

        jdbcService.execute(sql);

        return "execute success";
    }

}

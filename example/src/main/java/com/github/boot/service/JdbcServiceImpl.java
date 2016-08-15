package com.github.boot.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mwjsolar on 16/8/14.
 */
@Service
public class JdbcServiceImpl implements JdbcService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public void execute(String sql) {
        jdbcTemplate.execute(sql);
    }
}

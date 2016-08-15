package com.github.boot.service;

/**
 * Created by mwjsolar on 16/8/14.
 */
public interface JdbcService {
    /**
     * 执行sql
     * @param sql
     */
    void execute(String sql);
}

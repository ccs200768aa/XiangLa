package com.tiki.xiangla.oss.config.db;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-29
 * Time: 20:02
 */
@Configuration
@MapperScan("com.tiki.xiangla.oss.biz.dao.*")
public class MybatisPlusConfig {
    /**
     * mybatis-plus 分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLocalPage(true);
        return paginationInterceptor;
    }
}

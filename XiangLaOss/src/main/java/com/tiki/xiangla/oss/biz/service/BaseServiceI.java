package com.tiki.xiangla.oss.biz.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import java.io.Serializable;
import java.util.List;

public interface BaseServiceI<T> {
    List<T> selectList(Wrapper<T> wrapper);

    int saveEntity(T t);

    int updateEntity(T t);

    T findEntityById(Serializable id);

    int deleteEntityById(Serializable id);
}

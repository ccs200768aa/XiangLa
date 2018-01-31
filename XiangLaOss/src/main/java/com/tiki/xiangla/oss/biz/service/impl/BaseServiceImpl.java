package com.tiki.xiangla.oss.biz.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tiki.xiangla.oss.biz.SuperMapper;
import com.tiki.xiangla.oss.biz.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-31
 * Time: 17:56
 */
public class BaseServiceImpl<T> implements BaseServiceI<T> {

    @Autowired
    SuperMapper superMapper;

    @Override
    public List<T> selectList(Wrapper<T> wrapper) {
        return superMapper.selectList(wrapper);
    }

    @Override
    public int saveEntity(T t) {
        return superMapper.insert(t);
    }

    @Override
    public int updateEntity(T t) {
        return superMapper.updateById(t);
    }

    @Override
    public T findEntityById(Serializable id) {
        return (T) superMapper.selectById(id);
    }

    @Override
    public int deleteEntityById(Serializable id) {
        return superMapper.deleteById(id);
    }
}

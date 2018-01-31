package com.tiki.xiangla.oss.biz.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tiki.xiangla.oss.biz.dao.merch.MerchUserMapper;
import com.tiki.xiangla.oss.biz.entity.merch.MerchUser;
import com.tiki.xiangla.oss.biz.service.MerchUserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-29
 * Time: 18:19
 */
@Service(value = "merchUserService")
public class MerchUserServiceImpl extends BaseServiceImpl<MerchUser> implements MerchUserServiceI {
    @Autowired
    private MerchUserMapper merchUserMapper;

    @Override
    public int saveOrUpdateEntity(MerchUser mu) {
        if (mu.getMerchuserid() > 0) {
            return updateEntity(mu);
        } else {
            return saveEntity(mu);
        }
    }
}

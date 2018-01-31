package com.tiki.xiangla.oss.biz.service;

import com.tiki.xiangla.oss.biz.entity.merch.MerchUser;


public interface MerchUserServiceI extends BaseServiceI<MerchUser> {

    public int saveOrUpdateEntity(MerchUser mu);
}

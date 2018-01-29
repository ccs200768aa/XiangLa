package com.tiki.xiangla.oss.biz.controller.merch;

import com.tiki.xiangla.oss.biz.entity.merch.MerchUser;
import com.tiki.xiangla.oss.biz.service.MerchUserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-29
 * Time: 18:24
 */
@RestController
@RequestMapping(value = "/merchuser/*")
public class MerchUserController {
    @Autowired
    private MerchUserServiceI merchUserService;

    @GetMapping(value = "/queryList")
    public List<MerchUser> queryMerchUserList() {
        return merchUserService.selectList();
    }
}

package com.tiki.xiangla.oss.biz.controller.merch;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tiki.xiangla.core.constant.StringConstant;
import com.tiki.xiangla.oss.biz.entity.merch.MerchUser;
import com.tiki.xiangla.oss.biz.service.MerchUserServiceI;
import com.tiki.xiangla.oss.common.exception.ReturnResult;
import com.tiki.xiangla.oss.common.exception.XiangLaException;
import com.tiki.xiangla.oss.common.exception.XiangLaExceptionEnum;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

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

    @ApiOperation("商家人员列表")
    @GetMapping(value = "/queryList")
    public ReturnResult queryMerchUserList(MerchUser mu) {
        return new ReturnResult(merchUserService.selectList(new EntityWrapper<MerchUser>().like("username", mu.getUsername())));
    }

    @PostMapping(value = "/update")
    public ReturnResult updateMerchUser(MerchUser mu) {
        if (mu == null) throw new XiangLaException(XiangLaExceptionEnum.RET_INNER_ERROR);
        if (new ReturnResult("") == checkEmail(mu.getEmail()))
            return new ReturnResult(merchUserService.saveOrUpdateEntity(mu));
        else
            throw new XiangLaException(XiangLaExceptionEnum.RET_INNER_ERROR);
    }


    @Description("校验邮箱")
    public ReturnResult checkEmail(String email) {
        if (Pattern.matches(StringConstant.REG_EMAIL, email)) {
            return new ReturnResult("");
        } else throw new XiangLaException(XiangLaExceptionEnum.RET_INNER_ERROR);
    }
}

package com.tiki.xiangla.oss.common.exception;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-30
 * Time: 17:29
 */
@Data
public class ReturnResult {

    private String retCode;

    private String retMsg;

    private Object result;

    public ReturnResult(XiangLaException ex) {
        this.retCode = ex.getRetCode();
        this.retMsg = ex.getRetMsg();
    }

    public ReturnResult(Object result) {
        this.retCode = XiangLaExceptionEnum.SUCCESS.getRetCode();
        this.retMsg = XiangLaExceptionEnum.SUCCESS.getRetMsg();
        this.result = result;
    }
}

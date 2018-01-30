package com.tiki.xiangla.oss.common.exception;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-30
 * Time: 17:18
 */
public class XiangLaException extends RuntimeException {

    private String retCode;
    private String retMsg;

    public XiangLaException(XiangLaExceptionEnum exceptionEnum){
        this.retCode = exceptionEnum.getRetCode();
        this.retMsg = exceptionEnum.getRetMsg();
    }

    public String getRetCode() {
        return retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }
}

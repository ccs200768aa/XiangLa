package com.tiki.xiangla.oss.common.exception;

public enum XiangLaExceptionEnum {
    SUCCESS("0", "成功"),
    RET_INNER_ERROR("-1", "系统内部错误"),

    /**
     * ----------------商户信息---100000000-199999999-------------------
     */
    RET_MERCH_USER_MOBILE_EXIST("100001001", "商户管理员手机号已存在");


    private String retCode;

    private String retMsg;

    XiangLaExceptionEnum(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public String getRetCode() {
        return retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }
}

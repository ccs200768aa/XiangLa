package com.tiki.xiangla.oss.config.web;

import com.tiki.xiangla.oss.common.exception.ReturnResult;
import com.tiki.xiangla.oss.common.exception.XiangLaException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Tiki
 * Date: 2018-01-30
 * Time: 17:23
 */
@RestControllerAdvice
public class XiangLaExceptionHandler {

    @ExceptionHandler(value = XiangLaException.class)
    public ReturnResult exceptionHandle(XiangLaException ex) {
        return new ReturnResult(ex);
    }
}

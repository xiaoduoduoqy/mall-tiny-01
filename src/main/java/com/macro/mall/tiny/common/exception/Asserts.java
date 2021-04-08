package com.macro.mall.tiny.common.exception;

import com.macro.mall.tiny.common.api.IErrorCode;

/**
 * Created with IntelliJ IDEA.
 * User: qianyong
 * Date: 2021/4/8
 * Time: 11:41
 * Description: 断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}

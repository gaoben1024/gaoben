package com.syc.shop.commons.utils;

import com.syc.shop.commons.vo.ResponseResult;

/**
 * 响应信息工具类
 */
public class ResultUtil<T> {

    private ResponseResult<T> result;

    public ResultUtil() {
        result = new ResponseResult<>();
        result.setSuccess(true);
        result.setMessage("success");
    }

    public ResponseResult<T> setData(T t) {
        this.result.setResult(t);
        return this.result;
    }

    public ResponseResult<T> setErrorMsg(String msg) {
        this.result.setSuccess(false);
        this.result.setMessage(msg);
        return this.result;
    }
}

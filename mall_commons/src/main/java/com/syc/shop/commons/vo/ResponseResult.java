package com.syc.shop.commons.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应结果
 */
@Data
public class ResponseResult<T> implements Serializable {

    private boolean success;

    private String message;

    private T result;
}

package com.lemon.springbootdubboapi.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * description: 结果类
 *
 * @author lemon
 * @date 2019-08-01 17:13:06 创建
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = -4992390206222083180L;

    private Integer code;

    private T re;

    private String msg;
}

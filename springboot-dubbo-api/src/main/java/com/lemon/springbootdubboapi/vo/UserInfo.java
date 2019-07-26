package com.lemon.springbootdubboapi.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * description:
 *
 * @author lemon
 * @date 2019-07-26 17:40:06 创建
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -414987426602265069L;

    private String name;

    private Integer age;

    private Date birthday;
}

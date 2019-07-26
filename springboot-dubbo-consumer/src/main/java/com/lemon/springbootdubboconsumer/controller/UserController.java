package com.lemon.springbootdubboconsumer.controller;

import com.lemon.springbootdubboapi.api.UserService;
import com.lemon.springbootdubboapi.vo.UserInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * description:
 *
 * @author lemon
 * @date 2019-07-26 17:55:06 创建
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("sayHello")
    public String sayHello() {
        UserInfo user = new UserInfo();
        user.setName("王怜花");
        return userService.sayHello(user);
    }

    @GetMapping("getUser")
    public UserInfo getUser(String name) {
        return userService.getUser("yui");
    }
}

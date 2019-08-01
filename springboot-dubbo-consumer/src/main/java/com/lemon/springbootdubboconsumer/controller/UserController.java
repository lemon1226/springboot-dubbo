package com.lemon.springbootdubboconsumer.controller;

import com.lemon.springbootdubboapi.api.UserService;
import com.lemon.springbootdubboapi.vo.ResultVo;
import com.lemon.springbootdubboapi.vo.UserInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author lemon
 * @date 2019-07-26 17:55:06 创建
 */
@RestController
public class UserController {

    @Reference(mock = "com.lemon.springbootdubboconsumer.service.UserServiceFailBack")
    private UserService userService;

    @GetMapping("sayHello")
    public ResultVo<String> sayHello() {
        UserInfo user = new UserInfo();
        user.setName("王怜花");
        return userService.sayHello(user);
    }

    @GetMapping("getUser")
    public ResultVo<UserInfo> getUser(String name) {
        return userService.getUser("yui");
    }
}

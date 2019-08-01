package com.lemon.springbootdubboapi.api;


import com.lemon.springbootdubboapi.vo.ResultVo;
import com.lemon.springbootdubboapi.vo.UserInfo;

public interface UserService {

    ResultVo<String> sayHello(UserInfo user);

    ResultVo<UserInfo> getUser(String name);
}

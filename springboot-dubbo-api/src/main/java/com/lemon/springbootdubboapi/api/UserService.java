package com.lemon.springbootdubboapi.api;


import com.lemon.springbootdubboapi.vo.UserInfo;

public interface UserService {

    String sayHello(UserInfo user);

    UserInfo getUser(String name);
}

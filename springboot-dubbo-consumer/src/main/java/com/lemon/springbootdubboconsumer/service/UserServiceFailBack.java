package com.lemon.springbootdubboconsumer.service;

import com.lemon.springbootdubboapi.api.UserService;
import com.lemon.springbootdubboapi.util.ResultUtil;
import com.lemon.springbootdubboapi.vo.ResultVo;
import com.lemon.springbootdubboapi.vo.UserInfo;

/**
 * description: 用户服务降级类
 *
 * @author lemon
 * @date 2019-08-01 17:09:06 创建
 */
public class UserServiceFailBack implements UserService {

    @Override
    public ResultVo<String> sayHello(UserInfo user) {
        return ResultUtil.fail("网络开小差了，用户：" + user.getName());
    }

    @Override
    public ResultVo<UserInfo> getUser(String name) {
        return ResultUtil.fail("网络开小差了，用户：" + name);
    }
}

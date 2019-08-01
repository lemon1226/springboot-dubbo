package com.lemon.springbootdubboprovider.service;

import com.lemon.springbootdubboapi.api.UserService;
import com.lemon.springbootdubboapi.util.ResultUtil;
import com.lemon.springbootdubboapi.vo.ResultVo;
import com.lemon.springbootdubboapi.vo.UserInfo;
import org.apache.dubbo.config.annotation.Service;

import java.util.Date;

/**
 * description:
 *
 * @author lemon
 * @date 2019-07-26 17:44:06 创建
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResultVo<String> sayHello(UserInfo user) {
        return ResultUtil.success("你好，" + user.getName());
    }

    @Override
    public ResultVo<UserInfo> getUser(String name) {
        UserInfo user = new UserInfo();
        user.setAge(100);
        user.setName("胡汉三");
        user.setBirthday(new Date());
        return ResultUtil.success(user);
    }
}

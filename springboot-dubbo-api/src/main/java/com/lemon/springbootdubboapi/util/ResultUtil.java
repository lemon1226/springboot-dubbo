package com.lemon.springbootdubboapi.util;

import com.lemon.springbootdubboapi.vo.ResultVo;

/**
 * description:
 *
 * @author lemon
 * @date 2019-08-01 17:17:06 创建
 */
public class ResultUtil {

    public static ResultVo success(Object re){
        ResultVo resultVo = new ResultVo();
        resultVo.setRe(re);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo fail(String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(-1);
        resultVo.setMsg(msg);
        return resultVo;
    }
}

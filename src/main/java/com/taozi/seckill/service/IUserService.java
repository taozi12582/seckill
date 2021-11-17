package com.taozi.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taozi.seckill.pojo.User;
import com.taozi.seckill.vo.LoginVo;
import com.taozi.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author taozi
 * @since 2021-11-16
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
}

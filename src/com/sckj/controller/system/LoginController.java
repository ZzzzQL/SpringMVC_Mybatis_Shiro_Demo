package com.sckj.controller.system;

import lombok.extern.slf4j.Slf4j;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FileName： LoginController
 * @Description： 登录控制器
 * @Author： JayYang
 * @Date： 2017-12-18 17:57
 * @Version: 1.0
 */
@Controller
@Slf4j
public class LoginController{

    //登录页面
    @RequestMapping(value = "/loginPage")
    public String loginPage(){
        return "forward:login.jsp";
    }

    //实现登录认证
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        //获取当前登录对象
        Subject currentUser = SecurityUtils.getSubject();

        //如果当前登录对象没有认证
        if(!currentUser.isAuthenticated()){
            //把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            //rememberme功能
            token.setRememberMe(true);

            try {
                currentUser.login(token);
            } catch (AuthenticationException ae) {
                ae.getMessage();
                return "redirect:/login.jsp";
            }

        }
        return "index";
    }

}

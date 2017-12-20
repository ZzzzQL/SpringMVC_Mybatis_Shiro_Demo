package com.sckj.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FileName： LoginController
 * @Description： 登录控制器
 * @Author： JayYang
 * @Date： 2017-12-18 17:57
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController{

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){

        if("admin".equals(username) && "admin".equals(password)){
            return "index";
        }else{
            return "error";
        }
    }

}

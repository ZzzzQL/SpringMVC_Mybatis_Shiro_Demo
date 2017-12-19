package com.sckj.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @FileName： LoginController
 * @Description： 登录控制器
 * @Author： JayYang
 * @Date： 2017-12-18 17:57
 * @Version: 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView goToLoginPage(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("/login.html",request,response);
        return mv;
    }

}

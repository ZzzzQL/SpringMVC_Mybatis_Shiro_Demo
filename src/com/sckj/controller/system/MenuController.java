package com.sckj.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FileName： MenuController
 * @Description： 菜单管理
 * @Author： JayYang
 * @Date： 2017-12-29 14:16
 * @Version: 1.0
 */

@Controller
@RequestMapping(value = "/sysmenu")
public class MenuController {


    @RequestMapping(value = "/menuPage",method = RequestMethod.GET)
    public String goToMenuPage(){
        return "/system/menu_manage";
    }

}

package com.sckj.shiro.realms;

import com.sckj.bean.system.User;
import com.sckj.service.system.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @FileName： ShiroRealm
 * @Description：
 * @Author： JayYang
 * @Date： 2017-12-21 12:26
 * @Version: 1.0
 */

public class ShiroRealm extends AuthenticatingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //1、把 AuthenticationToken 转换为UsernamePasswordToken
        UsernamePasswordToken upToken= (UsernamePasswordToken)authenticationToken;

        //2、从 UsernamePasswordToken 中获取 username
        String username = upToken.getUsername();

        //3、调用数据库的方法，从数据库中查询 username 对应的用户记录
        User user  = userService.getUserByLoginAccount(username);

        //4、若用户不存在，则可以抛出 UnknownAccountException 异常
        if(user == null){
            throw new UnknownAccountException("用户不存在");
        }

        //5、根据用户信息的情况，决定是否需要抛出其他的 AuthenticationException 异常

        //6、根据用户的情况，来构建 AuthenticationInfo 对象并返回
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getLoginPass(),getName());

        return info;
    }
}

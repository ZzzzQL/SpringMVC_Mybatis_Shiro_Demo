package com.sckj.shiro.realms;

import com.sckj.bean.system.User;
import com.sckj.service.system.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @FileName： ShiroRealm
 * @Description：
 * @Author： JayYang
 * @Date： 2017-12-21 12:26
 * @Version: 1.0
 */

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;


    //用于认证的方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1、把 AuthenticationToken 转换为UsernamePasswordToken
        UsernamePasswordToken upToken= (UsernamePasswordToken)token;

        //2、从 UsernamePasswordToken 中获取 username,password
        String username = upToken.getUsername();
        String password = new String(upToken.getPassword());

        //3、调用数据库的方法，从数据库中查询 username 对应的用户记录
        User user  = userService.getUserByLoginAccount(username);

        //4、若用户不存在，则可以抛出 UnknownAccountException 异常
        if(user == null){
            throw new UnknownAccountException("用户不存在");
        }

        //5、若密码输入错误，则可以抛出密码不正确的 IncorrectCredentialsException 异常
        if(!password.equals(user.getLoginPass())){
            throw new IncorrectCredentialsException("密码错误");
        }

        //6、根据用户的情况，来构建 AuthenticationInfo 对象并返回
        //1). principal: 认证的实体信息，可以是username,也可以是数据表对应的实体类对象
        Object principal = user;

        //2). credentials: 密码
        Object credentials = user.getLoginPass();

        //3). realmName: 当前 realm 对象的 name.调用父类的 getName() 的方法即可
        String realmName = getName();

        //4). 盐值
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getLoginAccount());

        AuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials,credentialsSalt,realmName);

        return info;
    }

    //用于授权的方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //1. 从PrincipalCollection 中来获取登录用户的信息

        //2. 利用登录的用户的信息来获取当前用户的角色或权限（需要查询数据库）

        //3. 创建 SimpleAuthorizationInfo，并设置其 roles 属性

        return null;
    }
}

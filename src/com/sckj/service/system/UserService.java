package com.sckj.service.system;

import com.sckj.bean.system.User;

/**
 * Created by JayYang on 2017/12/25.
 */
public interface UserService {

    //根据用户名获得用户信息
    public User getUserByLoginAccount(String username);

}

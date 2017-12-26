package com.sckj.service.system.impl;

import com.sckj.bean.system.User;
import com.sckj.dao.system.UserMapper;
import com.sckj.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @FileName： UserSericeImpl
 * @Description： 用户Service实现
 * @Author： JayYang
 * @Date： 2017-12-25 12:06
 * @Version: 1.0
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLoginAccount(String username){
        return userMapper.selectByLoginAccount(username);
    }
}

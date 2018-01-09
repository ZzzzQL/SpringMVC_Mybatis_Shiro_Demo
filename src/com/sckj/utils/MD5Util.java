package com.sckj.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;


/**
 * @FileName： MD5Util
 * @Description： 获取MD5加密后的值
 * @Author： JayYang
 * @Date： 2017-12-26 8:52
 * @Version: 1.0
 */

public class MD5Util {

    @Test
    public void getMD5Password(){
        String hashAlgorithmName = "MD5";
        Object credentials = "111111";
        Object salt = "uiwueylm";
        int hashIterations = 1;

        Object result = new SimpleHash(hashAlgorithmName,credentials,salt,hashIterations);
        System.out.println(result);

    }

}

package com.jhly.document.service;

import com.jhly.document.mapper.UserMapper;
import com.jhly.document.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:JHLY
 * @Date:2019/10/2
 * @Description:com.jhly.document.service
 * @Version:1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录验证用户名密码
     *
     * @param uName
     * @param uPassword
     * @return
     */
    public boolean login(String uName, String uPassword) {
        int i = userMapper.selectUser(uName, uPassword);
        return i == 1 ? true : false;
    }

    /**
     * 取得登录成功的用户
     *
     * @param uName
     * @param uPassword
     * @return
     */
    public User getUser(String uName, String uPassword) {
        return userMapper.selectTheUser(uName, uPassword);
    }


    public boolean register(User user) {
        int i = userMapper.insertTheUser(user);
        return i == 1 ? true : false;
    }


}

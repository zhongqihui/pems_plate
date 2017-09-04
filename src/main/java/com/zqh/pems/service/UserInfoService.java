package com.zqh.pems.service;

import com.zqh.pems.mapper.UserInfoMapper;
import com.zqh.pems.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 钟启辉
* @company www.jiweitech.com
* @date 2017/8/31 14:48
* @description 用户service层
**/
@Service
public class UserInfoService extends BaseService<UserInfo,Long> {
    private UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoService(UserInfoMapper userInfoMapper) {
        super(userInfoMapper);
        this.userInfoMapper = userInfoMapper;
    }
}

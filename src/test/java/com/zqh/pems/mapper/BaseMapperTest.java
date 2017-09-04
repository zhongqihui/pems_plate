package com.zqh.pems.mapper;

import com.zqh.pems.po.UserInfo;
import com.zqh.pems.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhongqihui on 2017/2/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-core.xml"})
public class BaseMapperTest {


    @Autowired
    private UserInfoService userInfoService;


    @Test
    public void selectById() throws Exception {
        UserInfo userInfo = userInfoService.selectById(1L);
        System.out.println(userInfo);
    }

    @Test
    public void selectList() throws Exception {

    }

}
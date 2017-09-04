package com.zqh.pems.controller;

import com.zqh.pems.po.UserInfo;
import com.zqh.pems.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 钟启辉
* @company www.jiweitech.com
* @date 2017/8/31 15:58
* @description 用户信息控制层
**/
@Controller
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping(value = {"test"})
    public String test(Model model) {
        UserInfo userInfo = userInfoService.selectById(1L);
        model.addAttribute("object", userInfo);
        return "test";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}

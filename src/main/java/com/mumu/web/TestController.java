package com.mumu.web;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2020/7/20
 */
@RestController
public class TestController {
    @GetMapping("/test/baidu")
    public UserInfo baidu() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setBaiduId("baiduId");
        return userInfo;
    }

    @Data
    public static class UserInfo {
        private String baiduId;
    }
}

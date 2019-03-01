package com.gateway.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : WangYuQiang
 * @description:测试用例
 * @date: 2019/3/1
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/myself/test",method = RequestMethod.POST)
    public String test(){
        return "gateway成功了";
    }
}

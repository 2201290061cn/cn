package com.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//控制层的组件
@RequestMapping("/demo")
public class DemoController {


    @GetMapping("/echo")//web后端接口
    @ResponseBody
    public String echo() {
        return "echo";
    }


}

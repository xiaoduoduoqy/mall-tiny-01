package com.macro.mall.tiny.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(tags = "helloController", description = "启动首页")
@Controller
public class helloController {
    @ApiOperation("返回一个首页面")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHello() {
       // String a="12312312";
        return "index";
    }

}

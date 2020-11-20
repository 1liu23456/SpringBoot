package com.bjpowernode.springboot.controller;


import com.bjpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private School school;


    @RequestMapping("/config")
    public @ResponseBody String config() {
        return school.getName() + "=======" + school.getWebsit();
    }


    @Value("${school.name}")
    private String schoolName;
    @Value("${school.websit}")
    private String websit;

    @RequestMapping("/say")
    public @ResponseBody String say() {
        return "say hello springboot" + schoolName + websit;
    }

    @RequestMapping("/map")
    public @ResponseBody Map<String, Object> map() {
        Map<String, Object> hs = new HashMap<>();
        hs.put("message","SpringBoot Project");
        return hs;
    }
}

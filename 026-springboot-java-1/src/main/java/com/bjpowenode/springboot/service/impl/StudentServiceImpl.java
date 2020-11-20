package com.bjpowenode.springboot.service.impl;

import com.bjpowenode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "111";
    }
}

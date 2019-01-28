package com.example.demo.controller;

import com.example.demo.core.JdbcDaoSupport;
import com.example.demo.dao.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: liuxi
 * @Date: 2019/1/18 17:24
 * @Description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("")
    public User getUser(){

        return testService.test();
    }

    @PostMapping("add")
    public Integer addUser(@RequestBody User user){

        return testService.add(user);
    }

    @GetMapping("testSupprt")
    public Integer testSupprt() throws Exception {

        return testService.testDaoSupport();
    }

    @GetMapping("testSupportUpdate")
    public Integer testSupportUpdate() throws Exception{

        return testService.updateSupport();
    }

    @GetMapping("testDaoSupportQuery")
    public Object testDaoSupportQuery() throws Exception{

        return testService.testDaoSupportQuery();
    }



}

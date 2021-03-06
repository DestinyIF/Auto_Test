package com.course.controller;


import com.course.model.User;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "v1")
@RequestMapping("v1")

public class Demo {
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数",httpMethod = "GET")
    public int  getUserCount(){

        return template.selectOne("getUserCount");
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        int result = template.insert("addUser", user);
        System.out.println(user);
        return result;
       // return user;

    }
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){
        return template.update("updateUser",user);
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int deleteUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }

}

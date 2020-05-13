package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


// 这个Controller类的所有方法返回的数据直接写给浏览器。
@RestController
@Api(value = "/",description ="这是我全部的get方法")
public class MyGetMethod {

    @RequestMapping(value  = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){

        //HttpServerletRequest 装请求信息的类
        //HttpServerletResponse 装响应信息的类

        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "恭喜你获得cookies信息成功";
    }
    /**
     * 要求客户端携带cookies 访问
     *
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies来进行访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "老子要携带cookies访问";
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("login") &&
                    cookie.getValue().equals("true")){
                return "这是带cookies的GET请求 ";
            }
        }
        return "老子要携带cookies访问";
    }
    /**
     * 开发一个需要携带参数才能访问的get请求
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies才能进行访问的GET请求实现方法一",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end){
        HashMap<String, Integer> myList = new HashMap<>();

        myList.put("避孕套",100);
        myList.put("充气娃娃",9999);
        myList.put("震动棒",200);

        return myList;
    }

    /**
     * 第二种实现方式
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "要求客户端携带cookies才能进行访问的GET请求实现方法2",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        HashMap<String, Integer> myList = new HashMap<>();

        myList.put("日韩",100);
        myList.put("欧美",9999);
        myList.put("自拍",200);

        return myList;
    }


}

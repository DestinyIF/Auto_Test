package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/",description = "这是拓爹抄的Post请求")
@RequestMapping("/post")
public class MyPostMethod {
        // 用来存储cookie的变量
        /**
         * 至于static（静态的），被static修饰方法和属性从属于类是一个类属性，
         *     在内存里的方法区中不会被回收会一直存在，直到这段程序被终止。
         *     一般我们调用属性或方法需要用到构造器创建的实例对象来调用，
         *     而static修饰的可以通过类来调用该属性或方法。。
         */
        private static Cookie cookie;
        //用户登陆成功获取到cookies，然后再访问其他接口获取到列表
        @RequestMapping(value = "/login",method = RequestMethod.POST)
        @ApiOperation(value = "登录接口，成功后获取cookies信息",httpMethod = "POST")
        public String login(HttpServletResponse response,
                @RequestParam(value = "userName",required = true)String userName,
                @RequestParam(value = "passWord",required = true)String passWord){
            // 登录的验证逻辑
            if(userName.equals("tuo") && passWord.equals("123")){
                cookie = new Cookie("login","true");
                response.addCookie(cookie);
                return "登成功";

            }
            return "用户名或密码错误";

        }
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                              @RequestBody User u){

        User user;
        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        for(Cookie c : cookies){
            if(c.getName()=="login"
                    && c.getValue()=="true"
                    && u.getUserName()=="tuo"
                    && u.getPassword()=="123"
            ){
                user = new User();
                user.setName("lisi");
                user.setAge("18");
                user.setSex("man");
                return  user.toString();
            }

        }

        return "参数不合法";
    }
}

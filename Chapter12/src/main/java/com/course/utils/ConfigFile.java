package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {

    /**
     * 帮我们拼接URl
     * ResourceBundle 加载配置文件
     * 工具类使用静态方法 不要new 可以直接使用
     */

                                                                   //不用写完自动加载
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);


    //  拼接URL  使用自己写的枚举方法 一般不用
    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");
        String uri = "";
        String testUrl;
        if (name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        if (name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }

        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }

        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }

        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        testUrl = address + uri;
        return testUrl;/
    }


}

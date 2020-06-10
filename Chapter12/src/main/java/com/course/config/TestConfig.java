package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    /**
     * 静态的 只需要加载一次
     * 一定要和配置文件里的五个接口进行对应
     *
     */
    public  static String loginUrl;
    public  static String updateUserInfoUrl;

    public  static String getUserListUrl;
    public  static String getUserInfoUrl;
    public  static String addUserUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore cookieStore;
}

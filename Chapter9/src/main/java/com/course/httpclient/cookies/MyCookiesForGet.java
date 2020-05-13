package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForGet {

    private  String url;
    private ResourceBundle bundle;
    private CookieStore store;
    @BeforeTest
    public void beforTest(){
       bundle = ResourceBundle.getBundle("application", Locale.CHINA);
       url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        // 获取uri
        String uri = bundle.getString("getCookies.uri");
        // 拼接地址
        String testUrl = this.url +uri;
        HttpGet get = new HttpGet(testUrl);
        //
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        // 获取COOKIES信息
        this.store = client.getCookieStore();
        List<Cookie> cookiesList = store.getCookies();
        for (Cookie cookie :cookiesList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name =" + name
            + ";cookie value = "+ value);
        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        // 从配置文件中取出ur
        String uri = bundle.getString("test.get.with.cookies");
        // 拼接url
        String testUrl = this.url + uri;
        // 执行套路 声明一个执行方法  声明一个客户端 把请求方法带进去
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        // 先设置cookies信息
        client.setCookieStore(this.store);
        HttpResponse response = client.execute(get);

        // 获取响应状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode =" + statusCode );
        if (statusCode == 200){
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }
}

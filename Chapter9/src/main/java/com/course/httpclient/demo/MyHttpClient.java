package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {
    @Test
    public void test1() throws IOException {
        // 用来存放结果
        String result;
        //这是我们的get方法
        HttpGet get = new HttpGet("http://baidu.com");
        // 用来执行get 方法
        DefaultHttpClient client = new DefaultHttpClient();
        // 得到get的返回 返回的getEntity
        HttpResponse response = client.execute(get);
        // getEentity 需要toString 转换一下
        result =EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
}

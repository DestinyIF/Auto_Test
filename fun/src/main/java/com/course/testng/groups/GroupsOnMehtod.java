package com.course.testng.groups;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMehtod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试444");
    }

    @BeforeGroups("server")
    public void beforGroupsOnServer(){
        System.out.println("这是服务端组的测试运行之前");
    }
    @AfterGroups ("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组的测试运行之后");
    }
    @BeforeGroups("client")
    public void beforGroupsOnClient(){
        System.out.println("这是客户端组的测试运行之前");
    }
    @AfterGroups ("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组的测试运行之后");
    }
}

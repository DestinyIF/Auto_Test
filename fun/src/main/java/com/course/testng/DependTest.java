package com.course.testng;


import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new  RuntimeException();
    }
    // test2 依赖于test1是否执行成功
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}

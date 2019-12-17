package com.course.testng;


import org.testng.annotations.*;

import javax.sound.midi.Soundbank;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test第一条测试用例");
    }
    @Test
    public void testCase2(){
        System.out.println("Test第二条用例");

    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforMethod测试方法之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMthod测试方法之后运行");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("afterClass类运行之后");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass类运行之前");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }

}

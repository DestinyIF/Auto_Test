package com.course.testng.sutie;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import javax.xml.bind.SchemaOutputResolver;

public class SuitConfig {
    @BeforeSuite
    public void beforsuite(){
        System.out.println("Beforsuite 运行了");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("Aftersuite 运行~");
    }

}

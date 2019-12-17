package com.course.testng;


import org.testng.annotations.Test;

public class ExpectedException {
    // 一个失败的异常测试
    @Test(expectedExceptions=RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个异常测试");
    }

    // 一个成功的异常测试
    public void runTimeExceptionSuccess(){
        System.out.println("这是异常测试");
        throw new RuntimeException();

    }
}

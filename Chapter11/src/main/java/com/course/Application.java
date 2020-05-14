package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;
// 以后用这个当入口程序
@EnableScheduling
@SpringBootApplication
public class Application {
                    // 可配置的应用程序上下文
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class,args);
    }
    @PreDestroy
    public void close(){
        Application.context.close();
    }

}

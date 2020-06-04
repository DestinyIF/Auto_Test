package com.course.model;

import lombok.Data;

/**
 * 和表结构一样为了映射进来
 * 注意字段不要写错
 * 让框架帮我我们做事情
 */

@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    @Override
    public String toString(){
        return (
                "id:"+id+","+
                        "userName:"+userName+","+
                        "password:"+password+","+
                        "age:"+age+","+
                        "sex:"+sex+","+
                        "permission:"+permission+","+
                        "isDelete:"+isDelete+"}"
                );
    }

}

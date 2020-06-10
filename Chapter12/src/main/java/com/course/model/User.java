package com.course.model;



/**
 * 和表结构一样为了映射进来
 * 注意字段不要写错
 * 让框架帮我我们做事情
 */


public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    public User() {
    }

    public User(int id, String userName, String password, String age, String sex, String permission, String isDelete) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.permission = permission;
        this.isDelete = isDelete;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}

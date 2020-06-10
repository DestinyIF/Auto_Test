package com.course.model;




public class GetUserInfoCase {
    private int userId;
    private String expected;

    public GetUserInfoCase() {
    }

    public GetUserInfoCase(int userId, String expected) {
        this.userId = userId;
        this.expected = expected;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    @Override
    public String toString() {
        return "GetUserInfoCase{" +
                "userId=" + userId +
                ", expected='" + expected + '\'' +
                '}';
    }
}

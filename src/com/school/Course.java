package com.school;

public class Course {
    private String title;
    private String code;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public void display() {
        System.out.println("Course ID: " + code + ", Course Name: " + title);
    }
}

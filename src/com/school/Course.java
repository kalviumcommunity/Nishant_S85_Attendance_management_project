package com.school;

public class Course {
    private static int courseCounter = 101;
    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = courseCounter++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
    public void displayDetails(){
       System.out.println("Course Id: C" +this.courseId+", Name: " + this.courseName);
    }
}

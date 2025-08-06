package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice Wonderland");
        Student s2 = new Student("Bob The Builder");

        Course c1 = new Course("Intro to Programming");

        System.out.println("Registered Students:");
        System.out.println("Student ID: " + s1.getStudentId() + ", Name: " + s1.getName());
        System.out.println("Student ID: " + s2.getStudentId() + ", Name: " + s2.getName());
      
        System.out.println("\nAvailable Courses:");
        System.out.println("Course ID: " + c1.getCourseId() + ", Name: " + c1.getCourseName());

        System.out.println("\n---- Attendance Recording ----");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1, c1, "Present"));
        attendanceLog.add(new AttendanceRecord(s2, c1, "Late"));    // Invalid
        attendanceLog.add(new AttendanceRecord(s2, c1, "Absent"));

        System.out.println("\n---- Attendance Log ----");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}

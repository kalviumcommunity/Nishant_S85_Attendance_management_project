package com.school;

public class AttendanceRecord {
    private Student student;
    private Course course;
    private String status;

    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;

        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            this.status = status;
        } else {
            System.out.println("Warning: Invalid attendance status provided. Set to 'Invalid'");
            this.status = "Invalid";
        }
    }

    public void displayRecord() {
        System.out.println("Attendance: Student ID " + student.getStudentId() +
                " in Course ID " + course.getCourseId() + " – Status: " + status);
    }
}

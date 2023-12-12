package com.generation;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";

        // Display course information
        courseService.displayCourseInformation(courseId);

        // Display student information before enrollment
        courseService.displayStudentInformation(studentId);

        // Enroll the student in the course
        courseService.enrollStudent(studentId, courseId);

        // Display student information after enrollment
        courseService.displayStudentInformation(studentId);

        // Unenroll the student from the course
        courseService.unEnrollStudent(studentId, courseId);

        // Display student information after unenrollment
        courseService.displayStudentInformation(studentId);
    }
}

package com.generation;

import java.util.HashMap;

public class CourseService {
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();

    public CourseService() {
        // Initialization of students and courses
        // (students and courses are hardcoded for simplicity in this example)
        students.put("120120", new Student("Santiago", "120120"));
        // ... (other student entries)
        courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
        // ... (other course entries)
    }

    public void enrollStudent(String studentId, String courseId) {
        // Check if both studentId and courseId exist
        if (students.containsKey(studentId) && courses.containsKey(courseId)) {
            Student student = students.get(studentId);
            Course course = courses.get(courseId);
            student.enroll(course);
            System.out.println(student.getName() + " has been enrolled in the course: " + course.getCourseName());
        } else {
            System.out.println("Invalid student ID or course ID. Enrollment failed.");
        }
    }

    public void unEnrollStudent(String studentId, String courseId) {
        // Check if both studentId and courseId exist
        if (students.containsKey(studentId) && courses.containsKey(courseId)) {
            Student student = students.get(studentId);
            Course course = courses.get(courseId);
            student.unEnroll(course);
            System.out.println(student.getName() + " has been unenrolled from the course: " + course.getCourseName());
        } else {
            System.out.println("Invalid student ID or course ID. Unenrollment failed.");
        }
    }

    public void displayCourseInformation(String courseId) {
        // Check if the courseId exists
        if (courses.containsKey(courseId)) {
            Course course = courses.get(courseId);
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Credits: " + course.getCredits());
        } else {
            System.out.println("Invalid course ID. Course information not found.");
        }
    }

    public void displayStudentInformation(String studentId) {
        // Check if the studentId exists
        if (students.containsKey(studentId)) {
            Student student = students.get(studentId);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getId());
            System.out.println("Enrolled Courses:");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println("- " + course.getCourseName());
            }
        } else {
            System.out.println("Invalid student ID. Student information not found.");
        }
    }
}

package com.generation;

public class Course {
    String name;
    String id;
    int credits;

    public Course(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public String getCourseId() {
        return id;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName(){
        return name;
    }

    @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", credits=" + credits + '}';
    }
}

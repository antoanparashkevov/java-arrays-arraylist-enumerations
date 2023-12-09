package com.citb408.university;

public class Course {
    private long id;
    public String name;
    private int numberOfCredits;
    private CourseType courseType;

    public Course(long id, String name, int numberOfCredits, CourseType courseType) {
        this.id = id;
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.courseType = courseType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfCredits=" + numberOfCredits +
                ", courseType=" + courseType +
                '}';
    }
}

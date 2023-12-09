package com.citb408;

import com.citb408.university.Course;
import com.citb408.university.CourseType;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "CITB408", 6, CourseType.REQUIRED);
        Course course2 = new Course(2, "CITB409", 7, CourseType.ELECTIVE);
        Course course3 = new Course(3, "CITB410", 8, CourseType.REQUIRED);
        Course course4 = new Course(4, "CITB411", 9, CourseType.ELECTIVE);
    }
}
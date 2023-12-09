package com.citb408;

import com.citb408.university.Course;
import com.citb408.university.CourseType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("CITB408", 6, CourseType.REQUIRED);
        Course course2 = new Course("CITB409", 7, CourseType.ELECTIVE);
        Course course3 = new Course("CITB410", 8, CourseType.REQUIRED);
        Course course4 = new Course("CITB411", 9, CourseType.ELECTIVE);

        List<Course> courseList = new ArrayList<>();

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);

        //ArrayList has its own toString() method by default
        System.out.println(courseList);
    }
}
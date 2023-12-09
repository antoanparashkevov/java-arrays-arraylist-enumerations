package com.citb408;

import com.citb408.university.*;

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

        Program program1 = new Program("Informatics");
        Program program2 = new Program("Music", ProgramType.MINOR);
        Program program3 = new Program("IT");

        program1.addCourse(course1);
        program1.addCourse(course2);

        program2.addCourse(course3);
        program2.addCourse(course4);

        program3.addCourse(course1);
        program3.addCourse(course2);

        System.out.println(program1);
        System.out.println(program2);
        System.out.println(program3);

        program1.printCourses();
        program2.printCourses();
        program3.printCourses();

        Student student = new Student("Ivan", "F192168");

        student.addProgram(program1);
        student.addProgram(program3);

        System.out.println(student);
        System.out.println(student.getPrograms());


    }
}
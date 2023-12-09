package com.citb408.university;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private ProgramType programType;
    private List<Course> coursesInsideProgram;

    public Program(String name) {
        this.name = name;
        this.programType = ProgramType.MAJOR;
        coursesInsideProgram = new ArrayList<>();
    }

    public Program(String name, ProgramType programType) {
        this.name = name;
        this.programType = programType;
        coursesInsideProgram = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public List<Course> getCoursesInsideProgram() {
        return coursesInsideProgram;
    }

    public void addCourse(Course course) {
        if(!this.coursesInsideProgram.contains(course)) {
            this.coursesInsideProgram.add(course);
        }
    }

    public void removeCourse(Course course) {
        this.coursesInsideProgram.remove(course);
    }

    public void printCourses() {
        for(Course course : this.coursesInsideProgram) {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programType=" + programType +
                ", coursesInsideProgram=" + coursesInsideProgram +
                '}';
    }
}

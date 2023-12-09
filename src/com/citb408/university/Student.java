package com.citb408.university;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private final String facultyNumber;
    private boolean graduated;

    private List<Program> programs;
    private List<Course> courses;
    private List<Course> coursesWithCredits;

    public Student(String name, String facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.graduated = false;

        this.programs = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.coursesWithCredits = new ArrayList<>();
    }

    public boolean isEnrolled(ProgramType programType) {
        for( Program program : this.programs) {
            if(program.getProgramType() == programType) {
                return true;
            }
        }
        return false;
    }

    public boolean addProgram(Program program) {
        if(!this.programs.contains(program) && !this.isEnrolled(program.getProgramType())) {
            this.programs.add(program);
            return true;
        }
        return false;
    }

    public void removeProgram(Program program) {
        this.programs.remove(program);
    }

    public void addCourse(Course course) {
        for(Program program : this.programs) {
            if(program.getCoursesInsideProgram().contains(course) && !this.courses.contains(course)) {
                this.courses.add(course);
            }
        }
    }

    public void addCourseWithCredits(Course course) {
        if(this.courses.contains(course) && !this.coursesWithCredits.contains(course)) {
            this.coursesWithCredits.add(course);
        }
    }

    public int totalCredits() {
        int sum = 0;

        for(Course course : this.coursesWithCredits) {
            sum += course.getNumberOfCredits();
        }

        return sum;
    }

    public int creditsToGet() {
        return ProgramType.MAJOR.getMinimalAmountOfCredits() - this.totalCredits();
    }

    public void graduateStudent() {
        if(creditsToGet() <= 0) {
            this.graduated = true;
        }
    }

    public String getName() {
        return name;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Course> getCoursesWithCredits() {
        return coursesWithCredits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", facultyNumber='" + facultyNumber + '\'' +
                ", graduated=" + graduated +
                '}';
    }
}

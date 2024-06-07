
package vu.balex;


import java.util.Scanner;

class cources {
    private String courseName;
    private String courseID;
    private int tuition;

    public cources(String courseName, String courseID, int tuition) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.tuition = tuition;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseDetails() {
        return "Course Name: " + courseName + ", Tuition: " + tuition;
    }
}

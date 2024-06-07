
package vu.balex;

import java.util.Scanner;

public class Balex {
    public static void main(String[] args) {
       
        cources[] courses = {
            new cources("Software Engineering", "BSE", 900000),
            new cources("Information Technology", "BIT", 750000),
            new cources("Computer Science", "BCS", 800000),
            new cources("Computer Engineering", "BCE", 950000)
        };


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter CourseID: ");
        String inputCourseID = scanner.nextLine();

        boolean found = false;

        for (cources course : courses) {
            if (course.getCourseID().equalsIgnoreCase(inputCourseID)) {
                System.out.println(course.getCourseDetails());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong CourseID details");
        }
        scanner.close();
    }
}
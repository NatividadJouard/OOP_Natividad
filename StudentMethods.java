/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information;

import java.util.Scanner;
/**
 *
 * @author user
 */
    public class StudentMethods {
//Student Index= SI    
    
        public static void AddSRecord(Scanner scan, Student[] students) {
        
            for (int i = 0; i < students.length; i++) {

                if (students[i] == null) {
                    System.out.println("Enter student name:");
                    String name = scan.nextLine();
                    System.out.println("Enter student course:");
                    String course = scan.nextLine();
                    double gwa = 0;

                    boolean numGwa = false;
                    while (!numGwa) {
                        System.out.println("Enter student GWA:");
                        if (scan.hasNextDouble()) {
                            gwa = scan.nextDouble();
                            numGwa = true;
                        } 
                        else {
                            System.out.println("Only numbers are allowed for GWA. Please try again.");
                            scan.next(); 
                        }
                    }
                        students[i] = new Student(name, course, gwa);
                        scan.nextLine(); 
                        break;
                }       
                        if (i == students.length - 1) {
                        System.out.println("Student record limit reached.");
                        }
            }
        }

        public static void EditSRecord(Scanner scan, Student[] students) {
            boolean viewStudents = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                viewStudents = true;
                ViewSRecords(students);
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + students[i].getName() + "\nCourse: " + students[i].getCourse() + "\nGWA: " + students[i].getGwa());
                }
            }
            if (!viewStudents) {
                System.out.println("No Student Found.");
                return;
            }
                System.out.println("Enter the number of the student you want to edit from (1 to " + students.length + "):");
                while (!scan.hasNextInt()) {
                    System.out.println("Invalid Key. Please enter a valid number.");
                    scan.next();
                }
            int SI = scan.nextInt() - 1;
            scan.nextLine();

            if (SI >= 0 && SI < students.length && students[SI] != null) {
                System.out.println("Enter new name:");
                String newName = scan.nextLine();
                System.out.println("Enter new course:");
                String newCourse = scan.nextLine();
                double newGwa = 0;
                boolean numGwa = false;

                while (!numGwa) {
                System.out.println("Enter new GWA:");

                    if (scan.hasNextDouble()) {
                        newGwa = scan.nextDouble();
                        numGwa = true;
                    } 
                    else {
                    System.out.println("Only numbers are allowed for GWA. Please try again.");
                    scan.next();
                    }
            }
            students[SI].setName(newName);
            students[SI].setCourse(newCourse);
            students[SI].setGwa(newGwa);
            System.out.println("Student information updated.");
            scan.nextLine();
            } 
            else {
            System.out.println("No Student Found.");
            }
}


        public static void ViewSRecords(Student[] students) {
            
            boolean ViewStudents = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                ViewStudents = true;
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + students[i].getName() + "\nCourse: " + students[i].getCourse() + "\nGWA: " + students[i].getGwa());
                System.out.println("");  
                }
            }
                if (!ViewStudents) {
                    System.out.println("No Student Found.");
                }
        }

        public static void DeleteSRecord(Scanner scan, Student[] students) {
            
            boolean ViewStudents = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                ViewStudents = true;
                ViewSRecords(students);
                System.out.println("Enter the number of the student you want to delete from (1 to " + students.length + "):");
                    while (!scan.hasNextInt()) {
                    System.out.println("Invalid Key. Please enter a valid number.");
                    scan.next();
                    }
                    int SI = scan.nextInt() - 1;
                    scan.nextLine(); 

                    if (SI >= 0 && SI < students.length && students[SI] != null) {
                        students[SI] = null;
                        System.out.println("Selected Student is deleted.");
                    } 
                    else {
                        System.out.println("No Student Found.");
                    }
                
                }
            }
                if (!ViewStudents) {
                    System.out.println("No Student Found.");
                }
                
        }
    }

package information;

import java.util.Scanner;

public class StudentMethods {
    
    
    public static void addStudent(Scanner scan, Student[] students) {
        
        for (int i = 0; i < students.length; i++) {
            
            if (students[i] == null) {
                System.out.println("Enter student name:");
                String name = scan.nextLine();
                System.out.println("Enter student course:");
                String course = scan.nextLine();
                double gwa = 0;
                boolean isValidGwa = false;
            
                while (!isValidGwa) {
                    System.out.println("Enter student GWA:");
                    if (scan.hasNextDouble()) {
                        gwa = scan.nextDouble();
                        isValidGwa = true;
                    } 
                    else {
                        System.out.println("Only numbers are allowed for GWA. Please try again.");
                        scan.next(); // clear the input buffer
                    }
                }
                    students[i] = new Student(name, course, gwa);
                    scan.nextLine(); // clear the newline character from the buffer
                    break;
            }
        }
    }

    public static void editStudent(Scanner scan, Student[] students) {
        System.out.println("Enter the number of the student you want to edit from (1 to " + students.length + "):");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.next();
            }
                int index = scan.nextInt() - 1;
                scan.nextLine(); 

        if (index >= 0 && index < students.length && students[index] != null) {
            System.out.println("Enter new name:");
            String newName = scan.nextLine();
            System.out.println("Enter new course:");
            String newCourse = scan.nextLine();
            double newGwa = 0;
            boolean validGwa = false;

            while (!validGwa) {
                System.out.println("Enter new GWA:");
                
                if (scan.hasNextDouble()) {
                    newGwa = scan.nextDouble();
                    validGwa = true;
                } 
                else {
                    System.out.println("Only numbers are allowed for GWA. Please try again.");
                    scan.next(); // clear the input buffer
                }
            }
                    students[index].setName(newName);
                    students[index].setCourse(newCourse);
                    students[index].setGwa(newGwa);
                    System.out.println("Student information updated.");
                    scan.nextLine();
        }   
                else {
                    System.out.println("No Student Found.");
                }
    }

    public static void viewStudent(Student[] students) {
        boolean hasStudents = false;
        
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
            hasStudents = true;
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName() + ", Course: " + students[i].getCourse() + ", GWA: " + students[i].getGwa());
            System.out.println("_______________________________");
            }
        }
            if (!hasStudents) {
                System.out.println("No Student Found.");
            }
    }
    
    public static void searchStudent(Scanner scan, Student[] students) {
        System.out.println("Enter the number of the student you want to search from (1 to " + students.length + "):");
        
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scan.next();
        }
            int index = scan.nextInt() - 1;
            scan.nextLine();
            if (index >= 0 && index < students.length && students[index] != null) {
                Student student = students[index];
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse() + ", GWA: " + student.getGwa());
            } 
            else {
                System.out.println("No Student Found.");
            }
    }

    public static void deleteStudent(Scanner scan, Student[] students) {
        System.out.println("Enter the number of the student you want to delete from (1 to " + students.length + "):");

        while (!scan.hasNextInt()) {
            System.out.println("Invalid Key. Please enter a valid number.");
            scan.next();
        }
            int index = scan.nextInt() - 1;
            scan.nextLine(); 

            if (index >= 0 && index < students.length && students[index] != null) {
                students[index] = null;
                System.out.println("Selected Student is deleted.");
            } else {
                System.out.println("No Student Found.");
            }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information;
import java.util.Scanner;
//Natividad TP
class Student {
    private String name;
    private String course;
    private double gwa;

    public Student(String name, String course, double gwa) {
        this.name = name;
        this.course = course;
        this.gwa = gwa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }

    public double getGwa() {
        return gwa;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGwa(double gwa) {
        this.gwa = gwa;
    }
    public void displaychoices(){
        System.out.println("Select an option:");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student Record");
        System.out.println("3. View All Records");
        System.out.println("4. Search Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.println("________________________");
    }
     public void displayLine(){
        
        System.out.println("________________________");
    }
}
    public class Information {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[10];
        
        int choice = 0;
        while (choice != 6) {
        Student student = new Student("", "", 0);
        student.displaychoices();
        
            while (!scan.hasNextInt()) {
                System.out.println("Invalid Key. Please try again.");
                scan.next();
                student.displaychoices();
            }
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You have Selected Add Student.");
                    StudentMethods.addStudent(scan, students);
                    student.displayLine();
                    break;
                case 2:
                    System.out.println("You have Selected Edit Student Record.");
                    StudentMethods.editStudent(scan, students);
                    student.displayLine();
                    break;
                case 3:
                    System.out.println("You have Selected View All Records.");
                    StudentMethods.viewStudent(students);
                    break;
                case 4:
                    System.out.println("You have Selected Search Student.");
                    StudentMethods.searchStudent(scan, students);
                    student.displayLine();
                    break;
                case 5:
                    System.out.println("You have Selected Delete Student.");
                    StudentMethods.deleteStudent(scan, students);
                    student.displayLine();
                    break;
                case 6:
                    System.out.println("Exited Student Records");
                    break;
                default:
                    System.out.println("Invalid Key. Please try again.");
            }
        }
    }
}


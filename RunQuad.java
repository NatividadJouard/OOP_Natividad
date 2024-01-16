/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runquad;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class RunQuad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, T for Trapezoid, or E to exit: ");
            char choice = scanner.next().charAt(0);

            if (choice == 'E' || choice == 'e') {
                System.out.println("Shapes are Fun.");
                break;
            }

            switch (choice) {
                case 'R':
                case 'r':
                    System.out.println("Rectangle: ");
                    Rectangle rectangle = new Rectangle();
                    rectangle.showDescription();
                    break;
                case 'S':
                case 's':
                    System.out.println("Square: ");
                    Square square = new Square();
                    square.showDescription();
                    break;
                case 'P':
                case 'p':
                    System.out.println("Parallelogram: ");
                    Parallelogram parallelogram = new Parallelogram();
                    parallelogram.showDescription();
                    break;
                case 'H':
                case 'h':
                    System.out.println("Rhombus: ");
                    Rhombus rhombus = new Rhombus();
                    rhombus.showDescription();
                    break;
                case 'T':
                case 't':
                    System.out.println("Trapezoid: ");
                    Trapezoid trapezoid = new Trapezoid();
                    trapezoid.showDescription();
                    break;
                default:
                    System.out.println("Invalid choice. Please press R, S, P, H, T, or E.");
            }
        }

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            System.out.println("Enter Number:");
            
            int num=input.nextInt();
          MyConversion n= new MyConversion();
          System.out.print("Binary: ");
            System.out.println(n.tobinary(num));
            
          Myoctal m=new Myoctal();
          System.out.print("Octal: ");
            System.out.println(m.tooctal(num)); 
            
          MyHexa b=new MyHexa();
          System.out.print("Hexadecimal: ");
            System.out.println(b.toHexa(num));
    }
    
}

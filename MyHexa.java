/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author user
 */
public class MyHexa {
    public  String toHexa(int num){
                    String Hexa=" ";

                while (num > 0) {
                    int r = num % 16;
                    num = num / 16;

                    if (r >= 10 && r <= 15) {
                        char hexDigit = (char) ('A' + (r - 10));
                        Hexa =  String.valueOf(hexDigit) + Hexa;
                    } else {
                        Hexa =   (r) + Hexa; 
                    }
                }

                return Hexa;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author user
 */
public class Myoctal {
    public  String tooctal(int num){
                    String octal="";
                    
                        while (num>7){
                            int r=num%8;
                            octal=r+octal;
                            num=num/8;
                            
                            
                        }
                     octal=num+octal;
                    return octal;
                }
}

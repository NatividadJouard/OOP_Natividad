/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion;

/**
 *
 * @author user
 */
public class MyConversion {
    public  String tobinary(int num){
                    String binary=" ";
                    
                        while (num>0){
                            int r=num%2;
                            binary= r+binary;
                            num=num/2;
                        }
     
                    return binary;
                }
}

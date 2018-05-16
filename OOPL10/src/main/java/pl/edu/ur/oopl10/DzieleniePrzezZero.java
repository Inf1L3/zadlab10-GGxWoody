 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author Przemek
 */
public class DzieleniePrzezZero extends Exception{
    public static int ThrowPrzezZero(int a,int b){
        int test=0;
        try {
            test = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Wyłapany w metodzie");
        }
        return test;
    }
    
    
}

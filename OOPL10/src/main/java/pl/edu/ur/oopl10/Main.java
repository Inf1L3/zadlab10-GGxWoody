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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DzieleniePrzezZero.ThrowPrzezZero(4,0);
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez 0");
        }
    }
    
}

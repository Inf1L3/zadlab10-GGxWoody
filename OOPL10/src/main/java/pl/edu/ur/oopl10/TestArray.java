/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;


public class TestArray {
    public static void zad2(){
        int[] tab = {1,2,3,4,5,6,7,8,9,0};
        int a = WprowadzZKonsoli.wprowadzInt();
        try {
            System.out.println("Liczba="+tab[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma liczy w tym miejscu");
        }
    }
}

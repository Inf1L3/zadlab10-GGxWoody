/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {

    public static int wprowadzInt() {
        Scanner input = new Scanner(System.in);
        int a;
        try {
            a = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono liczby");
            a = wprowadzInt();
        }
        return a;

    }

    public static char wprowadzChar() {
        Scanner input = new Scanner(System.in);
        char a;
        try {
            a = input.next(".").charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono 1 znaku!");
            a = wprowadzChar();
        }
        return a;
    }

    public static long wprowadzLong() {
        Scanner input = new Scanner(System.in);
        long a;
        try {
            a = input.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono longa!");
            a = wprowadzLong();
        }
        return a;
    }

    public static short wprowadzShort() {
        Scanner input = new Scanner(System.in);
        short a;
        try {
            a = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono short");
            a = wprowadzShort();
        }
        return a;
    }
    
    public static float wprowadzFloat() {
        Scanner input = new Scanner(System.in);
        float a;
        try {
            a = input.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono short");
            a = wprowadzFloat();
        }
        return a;
    }
    
    public static double wprowadzDouble() {
        Scanner input = new Scanner(System.in);
        double a;
        try {
            a = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono short");
            a = wprowadzDouble();
        }
        return a;
    }
    
    public static String wprowadzString() {
        Scanner input = new Scanner(System.in);
        String a;
        try {
            a = input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono short");
            a = wprowadzString();
        }
        return a;
    }
}

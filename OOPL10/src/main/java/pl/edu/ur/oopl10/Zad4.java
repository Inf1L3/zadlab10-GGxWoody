package pl.edu.ur.oopl10;

import java.util.Random;

public class Zad4 {
    public static void zad4(){
        Random random = new Random();
        int liczbaBledow=0;
        int liczbaDzialan=0;
        do{            
            double dzielenie;
            int liczba1,liczba2;
            liczba1 = random.nextInt(21)-10;
            liczba2 = random.nextInt(21)-10;
            try{
                dzielenie = liczba1/liczba2;
                System.out.println(liczbaDzialan+" dzielenie="+dzielenie);
                liczbaDzialan++;
            }catch (ArithmeticException e){
                System.err.println("Wylosowano dzielnik rowny 0");
                liczbaBledow++;
            }
        }while(liczbaBledow!=3);
    }
}

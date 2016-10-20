package hr.fer.oop.lab2.prob4;

import java.util.Scanner;

/**
 * Created by Lucija on 14.10.2016..
 */
public class PrimeNumbers {

    public static void main(String[] args){
        System.out.println("Upiši broj:");

        Scanner reader= new Scanner(System.in);
        int broj= reader.nextInt();
        int brojac=0;
        int br=0;


        System.out.println("You requested calculation of first " + broj + " prime numbers. Here they are: ");

        if(broj>=1) {

            for (int i = 2; i < broj; i++) {
                brojac=0;
                for (int j = 2; j <= Math.sqrt(i);j++){
                    if(i%j==0){
                        brojac=1;
                        break;
                    }
                }
                if(brojac==0){
                    br+=1;
                    System.out.println(br + ". "+i);
                }
            }

        }
    }
}
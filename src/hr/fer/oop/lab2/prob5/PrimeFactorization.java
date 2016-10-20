package hr.fer.oop.lab2.prob5;

import java.util.Scanner;

/**
 * Created by Lucija on 14.10.2016..
 */
public class PrimeFactorization {
    public static void main(String[] args){

        Scanner reader= new Scanner(System.in);
        System.out.println("Upiši broj:");
        int broj= reader.nextInt();
        int i=0;

        System.out.println("Faktorizacija na prim brojeve:");
        while(broj!=1){
            i+=1;
            System.out.println(i + ". " + prim(broj));
            broj= broj/prim(broj);


        }

    }

    static private int prim(int x){
        int brojac=0;
        int i=2;

        if(x>1) {

            for ( i = 2; i < x; i++) {
                brojac=0;
                for (int j = 2; j <= Math.sqrt(i);j++){
                    if(i%j==0){
                        brojac=1;
                        break;
                    }
                }
                if(brojac==0){
                    if(x%i==0){
                        break;
                    }
                }
            }

        }
        return i;

    }
}
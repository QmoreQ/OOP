package hr.fer.oop.lab2.prob7;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * Created by lucija on 20.10.16..
 */
public class ponavljanje {

    public static void main(String[] args){

        Scanner reader= new Scanner(System.in);
        int max=0;
        int broj_ponavljanja=0;
        String slovo="";

        System.out.println("upisi rijec:");

        String rijec =reader.next();


        String pomocni= new String();

        for(int i=0; i< rijec.length();i++){
                broj_ponavljanja=1;
            for(int j=1; j<rijec.length(); j++){
                if(rijec.charAt(i)==rijec.charAt(j)){
                    broj_ponavljanja +=1;
                }
            }
            if(broj_ponavljanja > max){
                max=broj_ponavljanja;
               // slovo=String.valueOf(rijec.charAt(i));
                System.out.println(slovo);
            }
            rijec=Remove(rijec,String.valueOf(rijec.charAt(i)));
        }


        System.out.println(slovo + "," + max);
    }

    public static String Remove(String niz, String slovo){
        String pomocna= new String();

        for(int i=0; i< niz.length();i++){
            for(int j=0; j<pomocna.length(); j++){
                if(niz.charAt(i)!=pomocna.charAt(j)){

                    pomocna=pomocna+niz.charAt(i);
                }
            }
        }
        System.out.println(pomocna);
        return  pomocna;

    }
}

package hr.fer.oop.lab2.prob9;

import java.util.Scanner;

/**
 * Created by lucija on 20.10.16..
 */
public class pronadji {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int max = 0;
        int broj_ponavljanja;
        String rijec = reader.next();


        char[] result = rijec.toCharArray();

        System.out.println(result);

       String pom="";


        for(int i=0 ; i < result.length;i++){
            broj_ponavljanja=0;
            for(int j=1; j< result.length;j++){
                if(result[i]==result[j]){
                    broj_ponavljanja+=1;
                }
            }
            if(broj_ponavljanja>max){
                max=broj_ponavljanja;
                pom=Character.toString(result[i]);
            }

        }

        System.out.println(pom + ","+ max );
    }
}

package hr.fer.oop.lab2.prob1;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

/**
 * Created by lucija on 20.10.16..
 */
public class Rectangle {
    public static void main(String[] args){

        String visina="";
        String sirina="";

        if(args.length != 0){
            if(args.length != 2){
                System.out.print("Neispravan broj argumenata");
                System.exit(1);
            }
            else{
                int zbroj= Integer.parseInt( args[0]) + Integer.parseInt(args[1]);
                System.out.print("you have specified a rectangle of width " + args[0] + " and height " +  args[1] +". " );
                System.out.print("Its area is " + Integer.parseInt( args[0]) * Integer.parseInt(args[1]) + " and its perimeter is " + zbroj + "." );

            }

        }

        else {

            do {
                System.out.print("Please provide height:");
                visina = Ucitavanje();
            }while(Integer.parseInt(visina) < 0);

            do {
                System.out.print("Please provide width:");
                sirina = Ucitavanje();
            }while(Integer.parseInt(sirina) < 0);
        }
        int opseg= Integer.parseInt(visina) + Integer.parseInt(sirina);
        int povrsina= Integer.parseInt(sirina)*Integer.parseInt(visina);

        System.out.print("you have specified a rectangle of width " + sirina + " and height " +  visina +". " );
        System.out.print("Its area is " + povrsina + " and its perimeter is " + opseg + "." );
    }


    private static String Ucitavanje(){
        Scanner reader= new Scanner(System.in);
        String ulaz= reader.nextLine();

        while(ulaz.isEmpty()){
            System.out.print("The input must not be blank.");
            ulaz= reader.nextLine();
        }

        return ulaz;
    }
}

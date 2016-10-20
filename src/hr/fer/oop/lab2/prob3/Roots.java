package hr.fer.oop.lab2.prob3;

import java.util.Scanner;

/**
 * Created by Lucija on 13.10.2016..
 */
public class Roots {
    public static void main(String[] args){
        double realni;
        double imaginarni;
        double korjen;
        double r;
        double fi;


        Scanner reader= new Scanner(System.in);

        System.out.print("Upiši relni dio:");
        realni= reader.nextInt();

        System.out.print("Upiši imaginarni dio:");
        imaginarni=reader.nextInt();

        System.out.print("Upiši koji korjen vadimo:");
        korjen=reader.nextInt();

        r=Math.sqrt(Math.pow((double)realni,(double)2)+Math.pow((double)imaginarni,(double)2));

        r=Math.pow((double)r,(double)(1/korjen));

        fi=Math.atan((imaginarni/realni));

        for(int i=0; i<korjen;i++){
            System.out.println();
            System.out.print(i+1 + ")" + Math.round(r*Math.cos((double)((fi + 2*i*Math.PI)/korjen))));
            if(Math.round((r* Math.sin((double)((fi + 2*i*Math.PI)/korjen)))) < 0){
                System.out.print(" - "  +Math.abs( Math.round((r* Math.sin((double)((fi + 2*i*Math.PI)/korjen))))) + "i");
            }
            else {
                System.out.print(" + " + Math.round((r* Math.sin((double)((fi + 2*i*Math.PI)/korjen)))) + "i");
            }

        }

    }
}
package hr.fer.oop.lab2.prob6;

/**
 * Created by Lucija on 14.10.2016..
 */
public class Shapes {
    public static void main(String[] args){

        for(int i=1; i<=23;i++){
            if(i==1 || i==8 || i==18|| i==23){
                crtaPlus();
            }
            if(i==2  || i==13|| i==16){
                crteDuze();
            }
            if(i==3 || i==14 || i==17 ){
                crteKrace();
            }
            if(i==5 || i==10  || i==20 ){
                crtice();
            }
            if(i==6 || i==11 || i==21){
                crticeDoljeM();
            }
            if(i==7 || i==12 || i==22){
                crticeDoljeV();
            }
            if(i==15){
                System.out.println();
            }

        }


    }

    static void crtaPlus(){
        System.out.println("+--------+");
    }

    static void crteDuze(){
        System.out.println("\\        /");
    }

    static void crteKrace(){
        System.out.println(" \\______/ ");
    }

    static void crticeDoljeM(){
        System.out.println(" /      \\");
    }

    static void crtice(){
        System.out.println("  ______");
    }
    static void crticeDoljeV(){
        System.out.println("/        \\");
    }
}
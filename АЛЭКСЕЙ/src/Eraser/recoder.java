package Eraser;
import java.util.Scanner;
public class recoder {


        public static void main(String[ ] args){
            Scanner scr = new Scanner(System.in) ;
            System.out.println("Введите число");
            long x = scr.nextLong();
            String c ="1";

            if ((x<=127) & (x>=-128))
                System.out.println("byte");
            if ((x>=-32768) & (x<=32768))
                System.out.println("short");
            if ((x>=-1474836482) & (x<=2147483647))
                System.out.println("integer");
            if ((x>=-147483648)|(x>2147483647))
                System.out.println("long");
            else System.out.println("Really?");
            while (x!=1){
                if(x%2==0 ){
                    c=c+"0";
                    x=x/2; }
                else {
                    c=c+1;
                    x=x/2;}}
            System.out.println(c);
        }

    }


package day2;
import static java.lang.Math.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double x = s.nextDouble();
        if(x >= 5){
            Double y = (Math.pow(x,2) - 10) / (x+7);
            System.out.println(y);
        } else if(x > -3){
            Double y = (x+3) * (Math.pow(x,2) - 2);
            System.out.println(y);
        } else{
            Double y = 420d;
            System.out.println(y);
        }
    }
}

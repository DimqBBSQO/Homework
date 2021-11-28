package day2;
import static java.lang.Math.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double result = 0d;
        if(x >= 5){
            double y = (Math.pow(x,2) - 10) / (x+7);
            result = y;
        } else if(x > -3){
            double z = (x+3) * (Math.pow(x,2) - 2);
            result = z;
        } else{
            double f = 420d;
            result = f;
        }
        System.out.println(result);
    }
}

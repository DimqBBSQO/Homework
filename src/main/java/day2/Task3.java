package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        int i = a+1;
        while (i < b){
            if(i%5 == 0 && i%10 !=0){
                System.out.print(i + " ");
                ;
            } else {
            } i++;
        }
    }
}

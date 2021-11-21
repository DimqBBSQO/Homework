package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x = scan.nextInt();
        int[] xm = new int[x];

        for (int i = 0; i < xm.length; i++) {
            xm[i] = rand.nextInt(10);
        }

        for (int j : xm) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Длина массива: " + xm.length);
        int sout8 = 0;
        for (int i = 0; i<xm.length; i++){
            if(xm[i]>8){
                sout8 = sout8 + 1;
            }
        }
        System.out.println("Количество чисел больше 8:"+sout8);

        int equal1 = 0;
        for (int i = 0; i<xm.length; i++){
            if(xm[i]==1){
                equal1 = equal1 + 1;
            }
        }
        System.out.println("Количество чисел равных 1:"+equal1);

        int even = 0;
        for (int i = 0; i<xm.length; i++){
            if(xm[i]%2==0){
                even = even + 1;
            }
        }
        System.out.println("Количество четных чисел:"+even);

        int odd = 0;
        for (int i = 0; i<xm.length; i++){
            if(xm[i]%2!=0){
                odd = odd + 1;
            }
        }
        System.out.println("Количество нечетных чисел:"+odd);


        int summ = 0;
        for (int i = 0; i < xm.length; i++){
            summ=summ + xm[i];
        }
        System.out.println("Сумма всех элементов массива: "+summ);
    }
}

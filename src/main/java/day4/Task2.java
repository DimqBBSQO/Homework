package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arrow = new int[100];

        for (int i = 0; i < arrow.length; i++) {
            arrow[i] = rand.nextInt(10000);
        }




        int max = arrow[0];
        int min = arrow[0];

        for (int i = 0; i < arrow.length; i++) {
            if (max < arrow[i]) {
                max = arrow[i];
            } else {
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        for (int i = 0; i < arrow.length; i++) {
            if (min > arrow[i]) {
                min = arrow[i];
            } else {
            }
        }
        System.out.println("Наименьший элемент массива: " + min);





        int devid10 = 0;
            for (int i = 0; i < arrow.length; i++) {
                if (arrow[i] % 10 == 0) {
                    devid10 = devid10 + 1;
                } else{
                }
            }
            System.out.println("Количество чисел оканчивающихся на 10: " + devid10);




            int summ10 = 0;
            for (int i = 0; i < arrow.length; i++) {
                if (arrow[i] % 10 == 0) {
                    summ10 = summ10 + arrow[i];
                }else{
                }
            }
            System.out.println("Количество чисел оканчивающихся на 10: " + summ10);
    }
}
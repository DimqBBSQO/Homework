package day4;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arrow = new int[100];
        for(int i = 0; i < arrow.length; i++){
            arrow[i] = rand.nextInt(10000);
        }

        OptionalInt max = Arrays.stream(arrow).max();
        System.out.println("Наибольший элемент массива: "+max.getAsInt());
        OptionalInt min = Arrays.stream(arrow).min();
        System.out.println("Наименьший элемент массива: "+min.getAsInt());


        int devid10 = 0;
        for (int i = 0; i<arrow.length; i++){
            if(arrow[i]%10==0){
                devid10 = devid10 + 1;
            }
        }
        System.out.println("Количество чисел оканчивающихся на 10: "+devid10);


        int summ10 = 0;
        for (int i = 0; i<arrow.length; i++){
            if(arrow[i]%10==0){
                summ10 = summ10 + arrow[i];
            }
        }
        System.out.println("Количество чисел оканчивающихся на 10: "+summ10);
    }
}

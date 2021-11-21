package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();


        int[] arrow = new int[100];
        for (int i = 0; i<arrow.length; i++){
            arrow[i] = rand.nextInt(10000);
            System.out.print(arrow[i] + " ");
        }


        int max = 0;
        int indexForMax = 0;
        int score = 0;
        for (int i = 0; i < arrow.length-2; i++) {
            score = arrow[i]+arrow[i+1]+arrow[i+2];
            if (max <= score) {
                max = score;
                indexForMax=i;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(indexForMax);

    }
}

package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();


        int[] arrow = new int[20];
        for (int i = 0; i<arrow.length; i++){
            arrow[i] = rand.nextInt(10);
            System.out.print(arrow[i] + " ");
        }


        int max = 0;
        int indexForMax = 0;

        for (int i = 0; i < arrow.length-2; i++) {
            int score = 0;
            for (int n = i; n < i + 3; n++) {
                score = score + arrow[n];
            }
            if (score > max) {
                max = score;
                indexForMax = i;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(indexForMax);

    }
}

package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = 12;
        int y = 8;


        int[][] arrow = new int[x][y];
     for(int i = 0; i<x; i++){
         for(int j = 0; j<y; j++){
             arrow[i][j] = rand.nextInt(50);
         }
     }


        int[] summas = new int[x];
        int summ = 0;
        for(int i = 0; i<x; i++){
            summ=0;
            for(int j = 0; j<y; j++){
                summ = summ + arrow[i][j];
            } summas[i] = summ;
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(arrow[i][j]+" ");
            } System.out.print("Сумма="+summas[i]);
            System.out.println();
        }

        int max = 0;
        int indexForMax = 0;
        for (int i = 0; i < summas.length; i++) {
            int score = summas[i];
            if (max <= score) {
                max = score;
                indexForMax=i;
            }
        }
        System.out.println();
        System.out.print("Индекс наибольшей по сумме строки = ");
        System.out.println(indexForMax);

    }
}

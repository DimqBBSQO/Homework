package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            switch ((int) y){
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    System.out.println(x/y);
            }

        }
    }
}

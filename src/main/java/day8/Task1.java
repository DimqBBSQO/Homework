package day8;

public class Task1 {
    public static void main(String[] args) {
       long startTime = System.currentTimeMillis();

        String string = "";
             for(int i = 0; i <= 20000; i++){
               string = string+" "+ Integer.toString(i);
        }
        System.out.println(string);


        long stopTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: "+(stopTime - startTime));

        System.out.println();
        System.out.println();


        long startTime1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i<=20000; i++){
            stringBuilder.append(Integer.toString(i)).append(" ");
        }
        System.out.println(stringBuilder.toString());

        long stopTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: "+(stopTime1 - startTime1));



  }
}

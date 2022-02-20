package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Courier courier1 = new Courier();
        Picker picker1 = new Picker();

        System.out.println(courier1.getIsPayed());

        System.out.println(courier1);
        System.out.println(picker1);

        for (int i = 0; i<10000; i++){
            courier1.doWork();
        }

        for (int i = 0; i<10000; i++){
            picker1.doWork();
        }

        System.out.println(courier1);
        System.out.println(picker1);

        System.out.println(courier1.getIsPayed());


    }
}

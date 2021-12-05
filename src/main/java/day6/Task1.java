package day6;


public class Task1 {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.setModel("Honda CR-V");
        car1.setColor("Черный");
        car1.setYear(2008);
        car1.info();
        System.out.println("в этом году ей "+car1.yearsDifference(2021)+" лет");




        System.out.println();



        Motorbike moto1 = new Motorbike("Honda CBR", "Black", 2008);
        moto1.info();
        System.out.println("в этом году ему "+moto1.yearsDifference(2021)+" лет");

    }
}

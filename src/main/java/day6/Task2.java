package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane plane1 = new Airplane("Airbus", 2010, 20, 100);

        plane1.info();

        plane1.setYear(2000);
        plane1.setLength(15);

        System.out.println();

        plane1.fuelUp(50);

        plane1.info();

        System.out.println();

        plane1.fuelUp(100);

        plane1.info();
    }
}

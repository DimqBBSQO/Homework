package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike moto1 = new Motorbike("Honda CBR", "Black", 2008);

        System.out.println("Марка автомобиля: "+moto1.getModel());
        System.out.println("Цвет: "+moto1.getColor());
        System.out.println("Год выпуска: "+moto1.getYear());
    }
}

package day5;

public class Task1 {
    public static void main(String[] args) {
          Cars car1 = new Cars();
          car1.setModel("Honda CR-V");
          car1.setColor("Черный");
          car1.setYear(2008);

        System.out.println("Марка автомобиля: "+car1.getModel());
        System.out.println("Цвет: "+car1.getColor());
        System.out.println("Год выпуска: "+car1.getYear());
    }
}


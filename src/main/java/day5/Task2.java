package day5;


public class Task2 {
    public static void main(String[] args) {
Motorbike moto1 = new Motorbike("Honda", "Black", 2008);

        System.out.println("Марка автомобиля: "+moto1.getModel());
        System.out.println("Цвет: "+moto1.getColor());
        System.out.println("Год выпуска: "+moto1.getYear());
    }


        static class Motorbike{
        String model;
        String color;
        int year;



        public Motorbike(String model, String color, int year){
            this.model = model;
            this.color = color;
            this.year = year;
        }



        public String getModel(){
            return model;
        }

        public String getColor(){
            return color;
        }

        public int getYear(){
            return year; }
  }
}

package day6;

public class Motorbike {

        private String model;
        private String color;
        private int year;



        public Motorbike(String model, String color, int year){
            this.model = model;
            this.color = color;
            this.year = year;
        }


        void info() {
        System.out.println("Это мотоцикл " + model);
        }





    int yearsDifference(int inputYears){
        int x = inputYears - year;
        if(x<0){
            System.out.println("Введен неправильный год");
        } if (x==0){
            System.out.println("Машина новая");
        }else {
            inputYears = x;
        }
        return inputYears;
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

package day5;

public class Task1 {
    public static void main(String[] args) {
          Cars car1 = new Cars();
          car1.setModel("Honda");
          car1.setColor("Черный");
          car1.setYear(2008);

        System.out.println("Марка автомобиля: "+car1.getModel());
        System.out.println("Цвет: "+car1.getColor());
        System.out.println("Год выпуска: "+car1.getYear());
    }
    static class Cars{
        private String model;
        private String color;
        private int year;



        public void setModel(String model){
            if(model.isEmpty()){
                System.out.println("Вы забыли ввести модель!");
            }else{
                this.model = model;}
        }

        public String getModel(){
            return model;}




        public void setColor(String color){
            if(color.isEmpty()){
                System.out.println("Вы забыли ввести цвет!");
            }else{
                this.color = color;}
        }

        public String getColor(){
            return color;}



        public void setYear(int year){
            if(year<0){
                System.out.println("Год выпуска не может быть отрицательным!");
            }else{
                this.year = year;}
        }

        public int getYear(){
            return year;}


    }
}

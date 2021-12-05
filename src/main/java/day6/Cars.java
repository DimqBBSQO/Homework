package day6;

public class Cars {
    private String model;
    private String color;
    private int year;





    void info() {
        System.out.println("Это автомобиль " + model);
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




    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Вы забыли ввести модель!");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }



    public void setColor (String color){
            if (color.isEmpty()) {
                System.out.println("Вы забыли ввести цвет!");
            } else {
                this.color = color;
            }
        }
    public String getColor () {
            return color;
        }


    public void setYear ( int year){
            if (year < 0) {
                System.out.println("Год выпуска не может быть отрицательным!");
            } else {
                this.year = year;
            }
        }

    public int getYear () {
            return year;
        }
}

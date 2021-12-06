package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int fuel;



    public static void compareAirplanes(Airplane x, Airplane y){
        if(x.getLength() > y.getLength()){
            System.out.println("Длиннее самолет: "+x.getModel());
        }else if(x.getLength() == y.getLength()){
            System.out.println("Самолет "+x.getModel()+" и самолет "+y.getModel()+" равны по длине");
        }else if (x.getLength()<y.getLength()) {
            System.out.println("Длинее самолет: "+y.getModel());
        }else{
            System.out.println("ты на*бываешься");
        }
    }






    public Airplane(String producer, int year, int length, int fuel){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.fuel = 0;
    }


    void fuelUp(int fuel){
        int x = fuel + this.fuel;
        if (x < 0){
            System.out.println("Некорректный ввод топлива");
        }else {
            this.fuel = x;
        }
    }




    public void setModel(String producer) {
        if (producer.isEmpty()) {
            System.out.println("Вы забыли ввести модель!");
        } else {
            this.producer = producer;
        }
    }


    public void setYear (int year){
        if (year < 0) {
            System.out.println("Год выпуска не может быть отрицательным!");
        } else {
            this.year = year;
        }
    }



    public void setLength (int length){
        if (length <= 0) {
            System.out.println("Некорректный ввод длины");
        } else {
            this.length = length;
        }
    }



    public void setFuel (int fuel){
        if (fuel <= 0) {
            System.out.println("Некорректный ввод количества топлива");
        } else {
            this.fuel = fuel;
        }
    }


    public int getFuel () {
        return fuel;
    }

    public int getLength () {
        return length;
    }

    public String getModel () {
        return producer;
    }


    void info(){
        System.out.println("Модель самолета: " +producer);
        System.out.println("Год выпуска: "+year);
        System.out.println("Длина самолета в метрах: "+length);
        System.out.println("Количество топлива в баке: "+fuel);
    }
}

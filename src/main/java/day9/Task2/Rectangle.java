package day9.Task2;

public class Rectangle extends Figures {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return 2*sideA+2*sideB;
    }
}

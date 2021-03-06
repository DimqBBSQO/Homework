package day9.Task2;

public class Triangle extends Figures {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(String color, double sideA, double sideB, double sideC){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p = (sideA+sideB+sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }
}

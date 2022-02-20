package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 4);
        Circle circle2 = new Circle("Red", 10);
        Circle circle3 = new Circle("Blue", 5);

        Triangle triangle1 = new Triangle("Red", 10, 10, 10);
        Triangle triangle2 = new Triangle("Green", 10, 20, 30);
        Triangle triangle3 = new Triangle("Red", 10, 20, 15);

        Rectangle rectangle1 = new Rectangle("Red", 5, 10);
        Rectangle rectangle2 = new Rectangle("Orange", 40, 15);

        Figures[] figures = {circle1, circle2, circle3, triangle1, triangle2, triangle3, rectangle1, rectangle2};

    }

    public static double calculateRedPerimeter(Figures[] figures) {
        double i = 0;
        for (Figures x : figures) {
            if (x.getColor().equals("Red")) {
                i = i + x.perimeter();
            }
        }
        return i;
    }

    public static double calculateRedArea(Figures[] figures) {
        double i = 0;
        for (Figures x : figures) {
            if (x.getColor().equals("Red")) {
                i = i + x.area();
            }
        }
        return i;
    }
}


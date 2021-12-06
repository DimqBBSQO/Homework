package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2010, 20, 0);
        Airplane airplane2 = new Airplane("Airbus", 2010, 30, 0);
        Airplane airplane3 = new Airplane("TU", 2010, 15, 0);
        Airplane airplane4 = new Airplane("AN", 2010, 1, 0);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}
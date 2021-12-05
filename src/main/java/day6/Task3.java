package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Петров Петр Васильевич", "Математика");
        Student student1 = new Student("Иванов Иван");

        teacher1.evaluate(student1);

    }
}

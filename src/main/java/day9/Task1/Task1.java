package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
       Student student1 = new Student("Иванов Иван", "РФ 512");
       Teacher teacher1 = new Teacher("Катод Петр Иванович", "РТЦ");

       student1.printInfo();
       teacher1.printInfo();
    }
}

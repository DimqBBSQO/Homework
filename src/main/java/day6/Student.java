package day6;

public class Student {

    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }


    public void setStudentName(String studentName) {
        if (studentName.isEmpty()) {
            System.out.println("Вы забыли ввести имя!");
        } else {
            this.studentName = studentName;
        }
    }

    public String getName() {
        return studentName;
    }
}

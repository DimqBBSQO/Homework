package day6;

import java.util.Random;

public class Teacher {

    private String teacherName;
    private String teacherItem;

    public Teacher(String teacherName, String teacherItem){
        this.teacherName = teacherName;
        this.teacherItem = teacherItem;
    }


    void evaluate(Student studentName) {

        String grade = "оценка не выставлена";
        int min = 2;
        int max = 5;
        int diff = max - min;


        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        switch (i) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }
        System.out.println("Преподаватель " + teacherName + " оценил студента с именем " + studentName.getName() + " по предмету " + teacherItem + " на оценку "+grade);
    }

}

package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (int) (sum / grades.size());
    }

    public static void main(String[] args) {
//        Student link = new Student("Link");
//        link.addGrade(100);
//        link.addGrade(95);
//        System.out.println("Link's average : " + link.getGradeAverage());
//
//        Student zelda = new Student("Zelda");
//        zelda.addGrade(100);
//        zelda.addGrade(97);
//        System.out.println("Zelda's average : " + zelda.getGradeAverage());
//
//        Student navi = new Student("Navi");
//        navi.addGrade(100);
//        navi.addGrade(99);
//        System.out.println("Navi's average : " + navi.getGradeAverage());

    }

}

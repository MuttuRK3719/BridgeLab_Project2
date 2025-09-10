package java8features.stream;

import java.util.List;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("muttu", 99)
                , new Student("AAA", 45)
                , new Student("BBB", 25)
                , new Student("CC", 65));
    }

    //    if any student scored more than 90
    static boolean findCross90(List<Student> students) {
        return students.stream().anyMatch(student -> student.getMarks() > 90);
    }

    //Check if all students passed (score >= 35).
    static boolean allMatch(List<Student> students) {
        return students.stream().allMatch(student -> student.getMarks() > 35);
    }

    //    ○ Check if no student failed.
    static boolean NonMaths(List<Student> students) {
        return students.stream().noneMatch(student -> student.getMarks() < 35);
    }
}

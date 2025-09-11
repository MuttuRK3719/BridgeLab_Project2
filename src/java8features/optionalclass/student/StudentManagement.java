package java8features.optionalclass.student;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(101, "Ananya Rao", 92),
                new Student(102, "Rahul Verma", 85),
                new Student(103, "Sneha Kulkarni", 78),
                new Student(104, "Arvind Nair", 88),
                new Student(105, "Meera Iyer", 95),
                new Student(106, "Karthik Reddy", 67),
                new Student(107, "Pooja Singh", 29),
                new Student(108, "Vivek Joshi", 12)
        );
        startLetter(students).forEach(System.out::println);
        System.out.println(checkAllPass(students));//false
        System.out.println(avg(List.of()).orElse(0.0));
    }

    public static List<Student> startLetter(List<Student> students) {
        return students.stream().filter(s -> s.getName().startsWith("S")).toList();
    }

    // students scored above
    public static boolean checkAllPass(List<Student> students) {
        return students.stream().noneMatch(s -> s.getScore() < 35);
    }

    public static double classAverage(List<Student> students) {
        return students.stream().mapToInt(s -> s.getScore()).average().orElse(0);
    }

    //    OptionalDouble to handle the case when the list is empty
    public static OptionalDouble avg(List<Student> students) {
        return Optional
                .ofNullable(students)
                .map(list -> list.stream()
                        .mapToInt(s -> s.getScore())
                        .average()).orElse(OptionalDouble.empty());
    }
}

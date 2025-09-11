package java8features.optionalclass;

import javax.swing.text.StyledDocument;
import javax.swing.text.html.Option;
import java.util.Optional;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student(123, "muttu");
        System.out.println(studentPresent(student));
        System.out.println(studentPresent(null));

    }

    public static Optional<Student> studentPresent(Student student) {
        return Optional.ofNullable(student);
    }
}

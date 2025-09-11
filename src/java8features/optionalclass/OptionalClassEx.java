package java8features.optionalclass;

import javax.swing.text.html.Option;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        String st = "MUTTU";
        System.out.println(getName(st).orElse("Default"));
        System.out.println(getName(null));
        String email = null;
        String email2 = "muttu@gmail.com";
        System.out.println(orElseNull(email));
        System.out.println(orElseNull(email2));
        System.out.println(orElseThrow(email2));
//        System.out.println(orElseThrow(null));
        st="muttu";
        System.out.println(toUpperCase(st));

    }

    //    returns an Optional<String> for a username.
    public static Optional<String> getName(String name) {
        return Optional.ofNullable(name);
    }

    //    default value if email is null.
    public static String orElseNull(String name) {
        return Optional.ofNullable(name).orElse("null@gmail.com");
    }

    //     throw an exception if value is missing.
    public static Optional<String> orElseThrow(String name) {
        return Optional.ofNullable(name).orElseThrow().describeConstable();
    }

    //    to convert a string to uppercase safely.
    public static String toUpperCase(String name) {
        return Optional
                .of(name)
                .map(String::toUpperCase)
                .orElse("Default value");
    }
}

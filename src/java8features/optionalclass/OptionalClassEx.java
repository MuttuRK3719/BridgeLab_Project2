package java8features.optionalclass;

import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        String st = "MUTTU";
        System.out.println(getName(st).orElse("Default"));
        System.out.println(getName(null));
        String email=null;
        String email2="muttu@gmail.com";
        System.out.println(orElseNull(email));
        System.out.println(orElseNull(email2));

    }

    //    returns an Optional<String> for a username.
    public static Optional<String> getName(String name) {
        return Optional.ofNullable(name);
    }

    //    default value if email is null.
    public static String orElseNull(String name) {
        return Optional.ofNullable(name).orElse("null@gmail.com");
    }
}

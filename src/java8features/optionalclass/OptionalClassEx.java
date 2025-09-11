package java8features.optionalclass;

import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        String st = "MUTTU";
        System.out.println(getName(st).orElse("Default"));
        System.out.println(getName(null));

    }

    //    returns an Optional<String> for a username.
    public static Optional<String> getName(String name) {
        return Optional.ofNullable(name);
    }
}

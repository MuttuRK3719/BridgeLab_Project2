package exceptions.customexception.checked;

public class Voter {
    void register(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("The age must be greater >=18");
        else System.out.println("u can collect voter id");
    }

}

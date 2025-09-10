package java8features.fuctionalinterface;

public class SquarePrint {
    public static void main(String[] args) {
        CustomInterface customInterface = x -> x * x;
        customInterface.print(2);
    }
}

interface CustomInterface {
    int square(int n);

    default void print(int n) {
        System.out.println("The square of number is " + square(n));
    }
}
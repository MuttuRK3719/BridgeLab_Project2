package fuctionalinterface;

interface AddNumber {
    int add(int a, int b);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        AddNumber addNumber = (a, b) -> a + b;
        System.out.println(addNumber.add(20, 30));
    }
}


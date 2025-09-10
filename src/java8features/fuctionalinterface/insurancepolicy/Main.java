package java8features.fuctionalinterface.insurancepolicy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        List<Policy> policies = List.of(new Policy("p1234", "muttu", 2000)
                , new Policy("p2345", "Prasanna", 3000)
                , new Policy("p6789", "Dhanush", 5000)
                , new Policy("p1289", "Djith", 1000));
        System.out.println(operations.groupPolicies(policies));
    }
}

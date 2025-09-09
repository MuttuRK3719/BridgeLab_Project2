package fuctionalinterface.insurancepolicy;

import jdk.dynalink.linker.LinkerServices;

import java.util.Comparator;
import java.util.List;

public class Operations {
    List<Policy> filterPolicy(List<Policy> policies) {
        return policies.stream().filter(policy -> policy.getAmount() > 1200).toList();
    }
    List<Policy> sortPolicies(List<Policy> policies) {
        Comparator<Policy> sortByName = (policy1, policy2) -> policy1.getName().compareTo(policy2.getName());
        return policies.stream().sorted(sortByName).toList();
    }
    double getTotalAmount(List<Policy> policies) {
        return policies.stream().mapToDouble(policy -> policy.getAmount()).sum();
    }

}

package fuctionalinterface.insurancepolicy;

import jdk.dynalink.linker.LinkerServices;

import java.util.Comparator;
import java.util.List;

public class Operations {
    List<Policy> filterPolicy(List<Policy> policies) {
        return policies.stream().filter(policy -> policy.getAmount() > 1200).toList();
    }
}

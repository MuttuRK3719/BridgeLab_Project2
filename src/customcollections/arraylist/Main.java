package customcollections.arraylist;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        PolicyManagement policyManagement = new PolicyManagement();
        Policy policy1 = new Policy("p101", "Health", 5000, 500000, LocalDate.of(2025, 12, 15));
        Policy policy2 = new Policy("p104", "Car", 7000, 1500000, LocalDate.of(2025, 10, 10));
        Policy policy3 = new Policy("p103", "Health", 5000, 500000, LocalDate.of(2025, 9, 01));
        policyManagement.addPolicy(policy1);
        policyManagement.addPolicy(policy2);
        policyManagement.addPolicy(policy3);
        policyManagement.getPolicyById("p101");
        policyManagement.getPolicyExpireDate();


    }
}

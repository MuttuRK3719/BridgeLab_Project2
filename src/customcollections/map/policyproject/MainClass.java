package customcollections.map.policyproject;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        PolicyManagement policyManagement = new PolicyManagement();
        policyManagement.addPolicy(new Policy(1234,"Muttu", "car", 5000, 500000, LocalDate.of(2025, 8, 31)));
        policyManagement.addPolicy(new Policy(4567, "Prasa","bike", 5000, 750000, LocalDate.of(2025, 9, 30)));
        policyManagement.addPolicy(new Policy(1234, "Dhanush","car", 5000, 500000, LocalDate.of(2025, 9, 20)));
        policyManagement.addPolicy(new Policy(1234, "Dhanush","bike", 5000, 500000, LocalDate.of(2025, 9, 20)));
        policyManagement.displayById(1234);
        policyManagement.displayByExpiryDate();
        policyManagement.listPolicyOnHolderName("Dhanush");

    }
}

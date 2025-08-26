package customcollections.map.policyproject;

import customcollections.map.policyproject.performance.HashMapPerformance;
import customcollections.map.policyproject.performance.LinkedHashMapPerformance;
import customcollections.map.policyproject.performance.Performance;
import customcollections.map.policyproject.performance.TreeMapPerformance;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        PolicyManagement policyManagement = new PolicyManagement();
        policyManagement.addPolicy(new Policy(1234, "Muttu", "car", 5000, 500000, LocalDate.of(2025, 8, 31)));
        policyManagement.addPolicy(new Policy(4567, "Prasa", "bike", 5000, 750000, LocalDate.of(2025, 9, 30)));
        policyManagement.addPolicy(new Policy(1234, "Dhanush", "car", 5000, 500000, LocalDate.of(2025, 9, 20)));
        policyManagement.addPolicy(new Policy(1234, "Dhanush", "bike", 5000, 500000, LocalDate.of(2025, 9, 20)));
        policyManagement.addPolicy(new Policy(5678, "Harish", "health", 5000, 500000, LocalDate.of(2025, 8, 25)));
//        policyManagement.displayById(5678);
//        policyManagement.displayByExpiryDate();
//        policyManagement.listPolicyOnHolderName("Dhanush");
//        policyManagement.removeExpiredPolicy();
//        policyManagement.displayById(5678);
        Performance performance = new HashMapPerformance();
        performance.insertionPerformance();
        performance.searchPerformance();
        performance.deletePerformance();

        performance = new LinkedHashMapPerformance();
        performance.insertionPerformance();
        performance.searchPerformance();
        performance.deletePerformance();

        performance = new TreeMapPerformance();
        performance.insertionPerformance();
        performance.searchPerformance();
        performance.deletePerformance();

    }
}

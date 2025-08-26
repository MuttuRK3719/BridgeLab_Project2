package customcollections.setinterface.insurancepolicy;

import java.time.LocalDate;
import java.util.Scanner;

public class PolicyManager {
    Scanner scan = new Scanner(System.in);
    private PolicyStorage policyStorage;
    private DisplayPolicies displayPolicies;

    PolicyManager(PolicyStorage p, DisplayPolicies displayPolicies) {
        this.policyStorage = p;
        this.displayPolicies = displayPolicies;
    }

    public static void main(String[] args) {
        PolicyStorage policyStorage = new PolicyStorage();
        PolicyManager policyManager = new PolicyManager(policyStorage
                                                        ,new DisplayPolicies(policyStorage));
        Scanner scan = policyManager.scan;
        while (true) {
            System.out.println("1 for add policy ");
            System.out.println("2 for Display policies ");
            System.out.println("3 for Expiring policies in 30 days");
            System.out.println("4 for List of policies based on coverage ");

            switch (scan.nextInt()) {
                case 1 -> policyManager.addPolicyToSet();
                case 2 -> policyManager.displayPolicies.displayPolicy();
                case 3 -> policyManager.expirePolicy();
                case 4 -> policyManager.displayPolicies.policyCoverageBased();
            }
        }
    }

    public void addPolicyToSet() {
        Policy policy = addPolicy();
        policyStorage.addPolicyToSet(policy);
    }

    private Policy addPolicy() {
        Policy policy = new Policy();
        System.out.println("Enter Holder name: ");
        policy.setHolderName(scan.next());
        System.out.println("Enter number of year");
        policy.setExpireDateInYear(scan.nextInt());
        System.out.println("Enter number of Months");
        policy.setExpireDateInMonth(scan.nextInt());
        System.out.println("Enter number of days");
        policy.setExpireDateInDay(scan.nextInt());
        System.out.println("Enter policy coverage Type: ");
        policy.setCoverageType(scan.next());
        System.out.println("Enter loan amount ");
        policy.setAmount(scan.nextDouble());
        return policy;
    }

    public void expirePolicy() {
        for (Policy p : displayPolicies.getAllUniquePolicies()) {
            if (isExpireInMonth(p)) {
                System.out.println("It is expiring soon " + p);
            }
        }
    }

    public boolean isExpireInMonth(Policy policy) {
        LocalDate today = LocalDate.now();
        return !policy.getExpireDate().isBefore(today)
                && !policy.getExpireDate().isAfter(today.plusDays(30));
    }
}

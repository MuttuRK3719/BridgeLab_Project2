package customcollections.map.policyproject;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagement {
    private Map<Long, Policy> policyById;
    private Map<Long, Policy> policyByInsertionOrder;
    private Map<LocalDate, Policy> policyByExpiryDate;
    private Map<String, List<Policy>> policyList;

    PolicyManagement() {
        policyById = new HashMap<>();
        policyByInsertionOrder = new LinkedHashMap<>();
        policyByExpiryDate = new TreeMap<>();
        policyList = new HashMap<>();
    }

    void addPolicy(Policy policy) {
        policyById.put(policy.getPolicyId(), policy);
        policyByInsertionOrder.put(policy.getPolicyId(), policy);
        policyByExpiryDate.put(policy.getDate(), policy);
        policyList.computeIfAbsent(policy.getHolderName(), (list) -> new ArrayList<>())
                .add(policy);

    }

    void displayById(long policyId) {
        if (policyById.containsKey(policyId)) {
            System.out.println(policyById.get(policyId));
        } else System.out.println("The policy Id is not present");
    }

    void displayByInsertionOrder() {
        for (Map.Entry<Long, Policy> policy : policyByInsertionOrder.entrySet()) {
            System.out.println(policy);
        }
    }

    void displayByExpiryDate() {
        for (Map.Entry<LocalDate, Policy> policy : policyByExpiryDate.entrySet()) {
            System.out.println(policy);
        }
    }

    void listPolicyOnHolderName(String name) {
        if (policyList.containsKey(name)) {
            System.out.println(policyList.get(name));
        } else System.out.println("The user name is not present in list");
    }

    void removeExpiredPolicy() {
        for (var map : policyById.entrySet()) {
            if (isExpired(map.getValue())) {
                policyById.remove(map.getKey());
                policyByExpiryDate.remove(map.getValue().getDate());
                policyByInsertionOrder.remove(map.getKey());
                System.out.println(map.getValue());
            }
        }
    }

    boolean isExpired(Policy policy) {
        return policy.getDate().compareTo(LocalDate.now()) < 0;
    }
}

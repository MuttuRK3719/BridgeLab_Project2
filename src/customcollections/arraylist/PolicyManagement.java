package customcollections.arraylist;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PolicyManagement {
    private Map<String, Policy> policyHashMap;
    private Map<LocalDate, Policy> policyTreeMap;
    private Map<String, Policy> policyLinkedMap;

    public PolicyManagement() {
        this.policyHashMap = new HashMap<>();
        this.policyTreeMap = new TreeMap<>();
        this.policyLinkedMap = new LinkedHashMap<>();
    }

    public void addPolicy(Policy policy) {
        policyHashMap.put(policy.getPolicyId(), policy);
        policyTreeMap.put(policy.getDate(), policy);
        policyLinkedMap.put(policy.getPolicyId(), policy);

    }

    public void getPolicyById(String policyId) {
        if (policyHashMap.containsKey(policyId)) {
            System.out.println(policyHashMap.get(policyId));
        } else {
            System.out.println("This id is not present");
        }
    }

    public void getPolicyExpireDate() {
        for (var map : policyTreeMap.entrySet()) {
            System.out.println(map.getValue());
        }
    }

    public void getPolicyByInsertionOrder() {
        for (var map : policyLinkedMap.entrySet()) {
            System.out.println(map.getValue());
        }
    }

}

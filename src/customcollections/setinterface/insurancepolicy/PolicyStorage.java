package customcollections.setinterface.insurancepolicy;

import java.util.*;

public class PolicyStorage {
    private Set<Policy> policyHashSet = new HashSet<>();
    private Set<Policy> policyLinkedHashSet = new LinkedHashSet<>();
    private Comparator<Policy> basedOPolicyNumber = (policy1, policy2) -> policy1.getExpireDate().compareTo(policy2.getExpireDate());
    private Set<Policy> policyTreeSet = new TreeSet<>(basedOPolicyNumber);
    private Set<Policy> duplicatePolicy = new HashSet<>();
    private Map<String, List<Policy>> policyCoverage = new HashMap<>();

    public Map<String, List<Policy>> getPolicyCoverage() {
        return policyCoverage;
    }

    public Set<Policy> getDuplicatePolicy() {
        return duplicatePolicy;
    }

    public Set<Policy> getPolicyHashSet() {
        return policyHashSet;
    }

    boolean addPolicyToSet(Policy policy) {
        return addPolicyToHashSet(policy)
                && addPolicyToLinkedHashSet(policy)
                && addPolicyToTreeSet(policy);
    }

    boolean addPolicyToHashSet(Policy policy) {
        if (policyHashSet.contains(policy)) {
            System.out.println("This policy is in our account");
            duplicatePolicy.add(policy);
            return false;
        }
        if (policyCoverage.containsKey(policy.getCoverageType())) {
            policyCoverage.get(policy.getCoverageType()).add(policy);
        } else {
            List<Policy> policyList = new ArrayList<>();
            policyList.add(policy);
            policyCoverage.put(policy.getCoverageType(), policyList);

        }
        return policyHashSet.add(policy);
    }

    boolean addPolicyToLinkedHashSet(Policy policy) {
        return policyLinkedHashSet.add(policy);
    }

    boolean addPolicyToTreeSet(Policy policy) {
        return policyTreeSet.add(policy);
    }


}

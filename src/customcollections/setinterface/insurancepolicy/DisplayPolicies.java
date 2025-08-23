package customcollections.setinterface.insurancepolicy;

import java.util.List;
import java.util.Set;

public class DisplayPolicies {
    private PolicyStorage policyStorage;
    DisplayPolicies(PolicyStorage p){
        this.policyStorage=p;
    }
    Set<Policy> getAllUniquePolicies() {
        return policyStorage.getPolicyHashSet();
    }

    void displayPolicy() {
        for (Policy p : policyStorage.getPolicyHashSet()) {
            System.out.println(p);
        }
    }

    void policyCoverageBased(){
        for(var map:policyStorage.getPolicyCoverage().entrySet()){
            List<Policy> list=map.getValue();
            System.out.println(map.getKey());
            for(Policy p:list){
                System.out.println(p);
            }
        }
    }
}

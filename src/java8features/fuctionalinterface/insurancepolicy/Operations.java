package java8features.fuctionalinterface.insurancepolicy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Operations {

    //    Filter Policies by Premium Amount
    List<Policy> filterPolicy(List<Policy> policies) {
        return policies.stream().filter(policy -> policy.getAmount() > 1200).toList();
    }

    //    Sort Policies by Holder Name
    List<Policy> sortPolicies(List<Policy> policies) {
        Comparator<Policy> sortByName = (policy1, policy2) -> policy1.getName().compareTo(policy2.getName());
        return policies.stream().sorted(sortByName).toList();
    }

    //    Compute Total Premium
    double getTotalAmount(List<Policy> policies) {
        return policies.stream().mapToDouble(policy -> policy.getAmount()).sum();
    }

    //    print out the details of all policies
    void printPolicies(List<Policy> policies) {
        policies.forEach(System.out::println);
    }

    //    Filter out policies where the premium amount
    List<Policy> filterByPremium(List<Policy> policies) {
        return policies.stream().filter(x -> x.getAmount() > 1000 && x.getAmount() < 2000).toList();
    }

    //    Group the policies by its first character
    List<List<Policy>> groupPolicies(List<Policy> policies) {
        Map<Character, List<Policy>> map = policies.stream().collect(Collectors.groupingBy(policy -> policy.getName().charAt(0)));
        return new ArrayList<>(map.values());
    }

    //    Compute Average Premium
    public double findAverage(List<Policy> policies) {
        return policies.stream().mapToDouble(p -> p.getAmount()).average().getAsDouble();
    }

    //    Sort Policies by Premium and Print
    public List<Policy> sortByPremium(List<Policy> policies) {
        policies = policies
                .stream()
                .sorted((policy1, policy2) -> (int) (policy1.getAmount() - policy2.getAmount()))
                .toList();
        policies.forEach(System.out::println);
        return policies;
    }

    //    Check If Any Policy Exceeds a Certain Premium
    public boolean policyExceeds(List<Policy> policies) {
        return policies.stream().anyMatch(policy -> policy.getAmount() > 2000);
    }

    //     Count Policies for Each Premium Range
    public long countPolicies(List<Policy> policies) {
        return policies.stream().filter(policy -> policy.getAmount() > 2000).count();
    }

    //     Extract Unique Holder Names
    public List<Policy> findUnique(List<Policy> policies) {
        return policies.stream().distinct().toList();
    }

    //    Find Policies by Holder Name Substring
    public List<Policy> findPoliciesBySubstring(List<Policy> policies, String substring) {
        return policies.stream()
                .filter(policy -> policy.getName().indexOf(substring) != -1)
                .toList();
    }

    //     Create a Map of Policy Numbers to Premium Amounts
    public Map<String, Double> groupPolicies1(List<Policy> policies) {
        return policies
                .stream()
                .collect(Collectors.toMap(Policy::getPolicyNumber, policy -> policy.getAmount(), Double::sum));
    }
}
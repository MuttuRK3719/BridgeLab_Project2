package exceptions.policyapplication.premiumcalculation;

import java.time.LocalDate;

public class CheckDetails {
    void checkDetails(Policy policy) {
        if (policy.getAge() < 18) throw new DataNotFoundException();
        else if (policy.getDate().compareTo(LocalDate.now()) < 0) throw new DataNotFoundException();
        else if (policy.getPremium() < 0) throw new DataNotFoundException();
        else System.out.println("there is no issue in policy details ");
    }
}

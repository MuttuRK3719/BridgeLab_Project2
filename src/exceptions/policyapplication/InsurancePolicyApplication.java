package exceptions.policyapplication;

public class InsurancePolicyApplication {
    public static void main(String[] args) {
        Person person = new Person("Muttu", 23, 10, 10);
        Person person2 = new Person("xyz", 25, 3, 7);
        Person person3 = new Person("abc", 17, 9, 7);
        verification(person);//U are eligible for all the insurances
        verification(person2);//Sry you are facing health issue please recover it so  we cannot able to provide health insurance
        verification(person3);//Your age is invalid please enter valid age

    }

    static void verification(Person person) {
        try {
            if (person.getAge() < 18) throw new InvalidAgeException();
            else if (person.getHealthRate() < 5) throw new HealthIssueException();
            else if (person.getDrivingRate() < 7) throw new PoorDrivingRecordException();
            else System.out.println("U are eligible for all the insurances");
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        } catch (HealthIssueException exception) {
            System.out.println(exception.getMessage());
        } catch (PoorDrivingRecordException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

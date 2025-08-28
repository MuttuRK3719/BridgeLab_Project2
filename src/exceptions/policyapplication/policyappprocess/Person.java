package exceptions.policyapplication.policyappprocess;

public class Person {
    private String name;
    private int age;
    private int healthRate;
    private int drivingRate;

    public Person(String name, int age, int healthRate, int drivingRate) {
        this.name = name;
        this.age = age;
        this.healthRate = healthRate;
        this.drivingRate = drivingRate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealthRate() {
        return healthRate;
    }

    public int getDrivingRate() {
        return drivingRate;
    }
}

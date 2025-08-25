package enumclasses;

public class Test1 {
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    Day day;

    Test1(Day day) {
        this.day = day;
    }
    public static void main(String[] args) {
        String str="MONDAY";
        Test1 t=new Test1(Day.valueOf(str));
        t.dayIsLike();
        // Iterating over all the values in
        // enum using for loop
        for (Day var_1 : Day.values()) {
            System.out.println(var_1);
        }
    }


    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

}

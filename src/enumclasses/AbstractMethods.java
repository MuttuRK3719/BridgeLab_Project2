package enumclasses;

import java.util.EnumSet;

enum Day {
    MONDAY() {
        @Override
        public String getNumberOfDay() {
            return "1st day of a weak";
        }
    },
    TUESDAY() {
        @Override
        public String getNumberOfDay() {
            return "2nd day of a weak";
        }
    },
    WEDNESDAY() {
        @Override
        public String getNumberOfDay() {
            return "3rd day of a weak";
        }
    },
    THURSDAY() {
        @Override
        public String getNumberOfDay() {
            return "4th day of a weak";
        }
    },
    FRIDAY() {
        @Override
        public String getNumberOfDay() {
            return "5th day of a weak";
        }
    },
    SATURDAY() {
        @Override
        public String getNumberOfDay() {
            return "6th day of a weak";
        }
    },
    SUNDAY() {
        @Override
        public String getNumberOfDay() {
            return "7th day of a weak";
        }
    };

    public abstract String getNumberOfDay();
}

public class AbstractMethods {
    Day day;

    AbstractMethods(Day day) {
        this.day = day;
    }
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public static void main(String[] args) {
        AbstractMethods m1 = new AbstractMethods(Day.MONDAY);
//        System.out.println(m1.day.getNumberOfDay());
        EnumSet<Day> workDays=EnumSet.range(Day.WEDNESDAY,Day.SATURDAY);
        for(Day day:workDays){
            System.out.println(day);
        }

    }
}

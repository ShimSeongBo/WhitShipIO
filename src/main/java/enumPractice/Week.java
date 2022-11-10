package enumPractice;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class WeekExample {
    public static void main(String[] args) {
        Week today1 = Week.SUNDAY;
        Week today2 = Week.SUNDAY;
        System.out.println(today2 == today1);

        switch (today1) {
            case SUNDAY:
                System.out.println(1);

        }

    }
}
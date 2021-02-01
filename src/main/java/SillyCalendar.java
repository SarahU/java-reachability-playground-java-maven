public class SillyCalendar {

    public static String dayOfMonth(int month) {

        String result = "";

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> result = "this month has 31 days";

            case 4, 6, 9, 11 -> result ="this month has 30 days";

            case 2 -> result ="this month probably has 28 days";

            default -> result ="invalid month number";
        }
        return result;
    }

}

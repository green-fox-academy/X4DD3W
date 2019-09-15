public class CodingHours {
    public static void main(String[] args) {
        int daily = 6;
        int weekdays = 5;
        int semester = 17;
        float avg_hrs_weekly = 52;

        System.out.println("So many hours spent with coding in a semester:");
        System.out.println(semester * weekdays * daily);
        // 17 * 5 * 6 = 510

        System.out.println("The percentage of the coding hours in the semester:");
        int percentage = Math.round(100 * ((daily * weekdays) / avg_hrs_weekly));
        System.out.println(percentage + "%");
        // Create a new integer, "percentage" = rounded (100 * ((6 * 5 ) / 52)) = 58%

    }
}

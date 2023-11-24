package Section6;

/**
 * Workbook3_5
 */
public class Workbook3_5 {

    public static void main(String[] args) {
        int day = 3;
        boolean holiday = false;
        if (holiday) {
            System.out.println("Woohoo, no work!");
        } else if (day == 6 || day == 7) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up ate 7:00");
        }
    }
}
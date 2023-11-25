package Section8;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Rectangle's calculate Area!");
        System.out.println("Please input length");
        double length = scanner.nextDouble();
        System.out.println("Please input width");
        double width = scanner.nextDouble();
        scanner.close();
        calculateArea(length, width);

    }

    public static void calculateArea(double length, double width) {
        System.out.println("Area of ractangle is: " + (length + width));
    }
}

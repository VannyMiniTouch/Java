package Section5;

import java.util.Scanner;

/**
 * Chatbot
 */
public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Self Learning >>: Java Chatbot");
        System.out.println("Hello. What is your name?");
        String Username = scanner.nextLine();

        System.out.println("\nHi " + Username + "! I'm Javabot. Where are you from ?");
        String Country = scanner.nextLine();

        System.out.println(
                "\nI hear it's beautiful at " + Country + "! I'm from a place called Oracle \nHow old are you?");
        int Age = scanner.nextInt();

        System.out.println("\nSo you're " + Age
                + ", cool! I'm 400 years old. \nThis means I'm 8 times older than you. \nEnough about me. What's your favourite language? (just don't say Python)");
        scanner.nextLine();
        String Language = scanner.nextLine();

        System.out.println("\n" + Language + ", that's greate! Nice chatting with you " + Username
                + ". I have to log off now. See ya!");
        scanner.close();
    }
}
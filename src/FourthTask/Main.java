package FourthTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = "ff ab f 1234 jkjk";

        String[] words = string.split("\\s+");

        System.out.print("Enter the word's position: ");
        boolean check;

        do {
            if (!scn.hasNextInt()) {
                scn.nextLine();
                System.out.println("Invalid input!");
                System.out.print("Enter the word's position: ");
                check = true;
            } else {
                int input = scn.nextInt();
                if (input > words.length) {
                    System.out.print("Enter the word's position: ");
                    check = true;
                } else {
                    check = false;
                    boolean result = isPalindrome(words[input]);
                    if (!result) {
                        System.out.println("This is not a palindrome!");
                    } else {
                        System.out.println("This is a palindrome!");
                    }
                }
            }
        } while (check);
    }

    public static boolean isPalindrome(String data) {
        boolean result = true;
        for (int i = 0; i < data.length() / 2; i++) {
            if (data.charAt(i) != data.charAt(data.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

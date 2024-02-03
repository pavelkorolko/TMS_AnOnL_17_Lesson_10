package FifthTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scn.nextLine();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            str.append(input.charAt(i) + "" +  input.charAt(i));
        }

        System.out.println(str.toString());
    }
}

package SecondTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "Hello world! How are you?";

        String[] words = string.split(" ");

        int countMax = words[0].length();
        int indexMax = 0, indexMin = 0;
        int countMin = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= countMax) {
                countMax = words[i].length();
                indexMax = i;
            }

            if (words[i].length() <= countMin) {
                countMin = words[i].length();
                indexMin = i;
            }
        }

        System.out.println("Word with max char number: " + words[indexMax]);
        System.out.println("Word with min char number: " + words[indexMin]);
    }
}

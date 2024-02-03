package ThirdTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "ff ab f 1234 jkjk";

        String[] words = string.split("\\s+");
        int max = -1;
        int indexOfMax = -1;

        for (int i = 0; i < words.length; i++) {
            int coincidences = 0;
            char start = words[i].charAt(0);
            for (int j = 1; j < words[i].length(); j++) {
                if (start == words[i].charAt(j)) {
                    coincidences++;
                }
            }
            if (coincidences > max) {
                max = coincidences;
                indexOfMax = i;
            }
        }

        System.out.println("Min amount of coincidences are tracked at word: " + words[indexOfMax]);
    }
}

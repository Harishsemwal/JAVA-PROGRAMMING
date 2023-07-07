import java.util.*;
import java.io.*;
public class LetterCount {
    public static int[] createLetterCountArray(String str) {
        int[] letterCount = new int[26];

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercase = Character.toLowerCase(c);
                int index = lowercase - 'a';
                letterCount[index]++;
            }
        }

        return letterCount;
    }

    public static void main(String[] args) {
        String sampleString = "dehradun";
        int[] result = createLetterCountArray(sampleString);

        for (int i = 0; i < 26; i++) {
            if (result[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + result[i]);
            }
        }
    }
}

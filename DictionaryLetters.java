import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString;
        inputString = sc.nextLine();
        Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
        inputString = inputString.toLowerCase();
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(dictionary);
        sc.close();
    }
}
import java.util.HashMap;
import java.util.Map;
public class LetterCount {
    public static void main(String[] args) {
        String inputString = "Dehradun";
        Map<Character, Integer> letterCount = createDictionary(inputString);
        System.out.println(inputString);
        System.out.println(letterCount);
    }
    public static Map<Character, Integer> createDictionary(String inputString) {
        Map<Character, Integer> dictionary = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            // Check if the character is already in the dictionary
            if (dictionary.containsKey(c)) {
                // If it is, increment the count
                int count = dictionary.get(c);
                dictionary.put(c, count + 1);
            } else {
                // If it is not, add it to the dictionary with a count of 1
                dictionary.put(c, 1);
            }
        }
        System.out.println("Implemented By:Harish Prasad Semwal ||  Section:G || Roll No : 75");
        return dictionary;
    }
}

import java.util.*;

public class StringProgram {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "hello world";

        // length() function
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // toUpperCase() function
        String upperCaseStr = str2.toUpperCase();
        System.out.println("str2 in uppercase: " + upperCaseStr);

        // toLowerCase() function
        String lowerCaseStr = str1.toLowerCase();
        System.out.println("str1 in lowercase: " + lowerCaseStr);

        // charAt() function
        char charAtIndex = str1.charAt(6);
        System.out.println("Character at index 6 in str1: " + charAtIndex);

        // substring() function
        String subStr = str1.substring(6);
        System.out.println("Substring of str1 from index 6: " + subStr);

        // indexOf() function
        int index = str1.indexOf("World");
        System.out.println("Index of 'World' in str1: " + index);

        // equals() function
        boolean isEqual = str1.equals(str2);
        System.out.println("str1 and str2 are equal: " + isEqual);

        // compareTo() function
        int compareValue = str1.compareTo(str2);
        System.out.println("Comparison of str1 and str2: " + compareValue);
    }
}







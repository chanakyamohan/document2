import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2)); // Output: true

        str1 = "restful";
        str2 = "fluster";
        System.out.println(areAnagrams(str1, str2)); // Output: true
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // If the lengths are not the same after removing spaces and punctuation, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

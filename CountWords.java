/*
 Q3:Write a Java Program to count the number of words in a string using HashMap.
 Example : 
 Input : How are you all
 Output : Total number of words: 4

 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        Map<String, Integer> wordCounts = countWords(str);
        int totalCount = 0;
        for (int count : wordCounts.values()) {
            totalCount += count;
        }

        System.out.println("Total number of words: " + totalCount);
        scanner.close();
    }

    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCounts = new HashMap<>();

        if (str == null || str.isEmpty()) {
            return wordCounts;
        }

        String[] words = str.trim().split("\\s+");

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }
}

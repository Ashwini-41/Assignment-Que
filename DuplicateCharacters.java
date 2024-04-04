/*
 
Q4:Write a Java Program to find the duplicate characters in a string.

 */
public class DuplicateCharacters {

    static void findDuplicateCharacters(String str) {
        char[] chars = str.toCharArray();

        int[] charCounts = new int[256]; 

  
        for (char c : chars) {
            charCounts[c]++;
        }

        System.out.println("Duplicate characters in the string '" + str + "':");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + ": " + charCounts[i] + " times");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        findDuplicateCharacters(str);
    }
}

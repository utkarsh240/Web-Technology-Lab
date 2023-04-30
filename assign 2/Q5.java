import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        
        String inputString = "I am proud to be a KIIT Student";

        String replacedString = inputString.replace("proud", "happy");
        System.out.println("String after replacing 'proud' with 'happy': " + replacedString);

        String trimmedString = inputString.trim();
        System.out.println("String after trimming leading/trailing whitespace: " + trimmedString);

        String[] splitString = inputString.split(" ");
        System.out.println("String after splitting by space: ");
        for (String word : splitString) {
            System.out.println(word);
        }

        char charAtIndex5 = inputString.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        String substringFromIndex8 = inputString.substring(8);
        System.out.println("Substring starting from index 8: " + substringFromIndex8);
    }
}

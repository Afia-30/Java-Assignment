import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a string:");
        String input = scanner.nextLine();


        Map<Character, Integer> charCount = countCharacters(input);


        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> charCount = new HashMap<>();


        input = input.toLowerCase().replace(" ", "");


        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        return charCount;
    }
}

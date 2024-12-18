
    import java.util.Scanner;

    public class StringAnalysis {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter a string:");
            String input = scanner.nextLine();


            int wordCount = countWords(input);
            int charCount = countCharactersWithoutSpaces(input);
            int vowelCount = countVowels(input);
            int consonantCount = countConsonants(input);


            System.out.println("Words: " + wordCount);
            System.out.println("Chars: " + charCount);
            System.out.println("Vowels: " + vowelCount);
            System.out.println("Consonants: " + consonantCount);

            scanner.close();
        }

        public static int countWords(String input) {
            if (input == null || input.isEmpty()) {
                return 0;
            }
            String[] words = input.split("\\s+");
            return words.length;
        }

        public static int countCharactersWithoutSpaces(String input) {
            if (input == null || input.isEmpty()) {
                return 0;
            }
            input = input.replace(" ", "");
            return input.length();
        }

        public static int countVowels(String input) {
            int count = 0;
            input = input.toLowerCase();
            for (char c : input.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }

        public static int countConsonants(String input) {
            int count = 0;
            input = input.toLowerCase();
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z' && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    count++;
                }
            }
            return count;
        }
    }



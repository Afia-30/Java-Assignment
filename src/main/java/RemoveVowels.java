public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String result = removeVowels(input);
        System.out.println(result);
    }

    public static String removeVowels(String input) {
        return input.replaceAll("[AEIOUaeiou]", "");
    }
}



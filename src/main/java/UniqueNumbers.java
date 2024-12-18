import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};


        Map<Integer, Integer> numberCount = countNumbers(numbers);


        System.out.print("Output: ");
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static Map<Integer, Integer> countNumbers(int[] numbers) {
        Map<Integer, Integer> numberCount = new HashMap<>();


        for (int number : numbers) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        return numberCount;
    }
}

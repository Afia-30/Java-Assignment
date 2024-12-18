import java.util.LinkedHashMap;
import java.util.Map;

public class NoteCounter {
    public static void main(String[] args) {
        int amount = 546;
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Map<Integer, Integer> noteCount = countNotes(amount, notes);

        printNotes(noteCount);
    }

    public static Map<Integer, Integer> countNotes(int amount, int[] notes) {
        Map<Integer, Integer> noteCount = new LinkedHashMap<>();

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount -= note * count;
                noteCount.put(note, count);
            }
        }

        return noteCount;
    }

    public static void printNotes(Map<Integer, Integer> noteCount) {
        for (Map.Entry<Integer, Integer> entry : noteCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

import java.util.Scanner;

    public class LowestHeights {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] heights = new int[10];


            System.out.println("Enter the heights of 10 babies in cm:");
            for (int i = 0; i < 10; i++) {
                heights[i] = scanner.nextInt();
            }


            int lowest = Integer.MAX_VALUE;
            int secondLowest = Integer.MAX_VALUE;

            for (int height : heights) {
                if (height < lowest) {
                    secondLowest = lowest;
                    lowest = height;
                } else if (height < secondLowest && height != lowest) {
                    secondLowest = height;
                }
            }


            System.out.println("The two lowest heights are:");
            System.out.println(lowest);
            System.out.println(secondLowest);

            scanner.close();
        }
    }



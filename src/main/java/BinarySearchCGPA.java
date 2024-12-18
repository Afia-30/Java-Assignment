import java.util.Scanner;
    public class BinarySearchCGPA {
        public static void main(String[] args) {

            double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            selectionSortAscending(cgpas);


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter CGPA to search: ");
            double userCGPA = scanner.nextDouble();

            int index = binarySearch(cgpas, userCGPA);

            if (index != -1) {
                System.out.println("CGPA " + userCGPA + " found.  " );
            } else {
                System.out.println("CGPA " + userCGPA + " not found.");
            }
        }

        public static void selectionSortAscending(double[] cgpas) {
            int n = cgpas.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (cgpas[j] < cgpas[minIndex]) {
                        minIndex = j;
                    }
                }
                double temp = cgpas[minIndex];
                cgpas[minIndex] = cgpas[i];
                cgpas[i] = temp;
            }
        }

        public static int binarySearch(double[] cgpas, double target) {
            int left = 0;
            int right = cgpas.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;


                if (cgpas[mid] == target) {
                    return mid;
                }


                if (cgpas[mid] < target) {
                    left = mid + 1;
                }

                else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }

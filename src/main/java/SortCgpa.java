public class SortCgpa {
        public static void main(String[] args) {
            double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            selectionSortDescending(cgpas);

            System.out.println("Sorted CGPAs in descending order:");
            for (double cgpa : cgpas) {
                System.out.print(cgpa + " ");
            }
        }

        public static void selectionSortDescending(double[] cgpas) {
            int n = cgpas.length;

            for (int i = 0; i < n - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (cgpas[j] > cgpas[maxIndex]) {
                        maxIndex = j;
                    }
                }


                double temp = cgpas[maxIndex];
                cgpas[maxIndex] = cgpas[i];
                cgpas[i] = temp;
            }
        }
    }


public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double secondHighest = findSecondHighest(cgpas);
        System.out.println("The second highest CGPA is: " + secondHighest);
    }

    public static double findSecondHighest(double[] cgpas) {
        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for (double cgpa : cgpas) {
            if (cgpa > highest) {
                secondHighest = highest;
                highest = cgpa;
            } else if (cgpa > secondHighest && cgpa < highest) {
                secondHighest = cgpa;
            }
        }

        return secondHighest;
    }
}



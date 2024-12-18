public class NumericPattern {
    public static void main(String[] args) {

                int maxLength = 5;
                for (int i = maxLength; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

                for (int i = 2; i <= maxLength; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        }



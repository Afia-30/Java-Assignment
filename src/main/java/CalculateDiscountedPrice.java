import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateDiscountedPrice {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";


        int laptopPrice = extractNumber(paragraph, "85000");
        int mousePrice = extractNumber(paragraph, "2500");
        int discountPercentage = extractNumber(paragraph, "15");


        int totalCost = laptopPrice + mousePrice;


        double discount = (totalCost * discountPercentage) / 100.0;
        double finalCost = totalCost - discount;


        System.out.printf("Total cost after %d%% discount: %.2f tk%n", discountPercentage, finalCost);
    }

    public static int extractNumber(String text, String defaultValue) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group().equals(defaultValue)) {
                return Integer.parseInt(matcher.group());
            }
        }
        return 0;
    }
}

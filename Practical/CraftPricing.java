import java.util.Scanner;

public class CraftPricing {
    public static final int ADDITIONAL_MANHOUR_COST = 12;
    public static final int SHIPPING_COST = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input product name: ");
        String productName = scanner.nextLine();
        System.out.println("Input material cost: ");
        double materialCost = Math.max(scanner.nextDouble(), 0);
        System.out.println("Input number of man hours: ");
        int manHour = Math.max(scanner.nextInt(), 0);
        double price = (materialCost + ADDITIONAL_MANHOUR_COST) * manHour + SHIPPING_COST;
        System.out.println(productName + " will cost $" + String.format("%.2f", price));
    }
}
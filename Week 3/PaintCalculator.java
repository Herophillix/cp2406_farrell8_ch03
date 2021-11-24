import java.util.Scanner;

public class PaintCalculator {
    public static final int SQFT_PER_GAL = 350;
    public static final int PRICE_PER_GAL = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = GetInput(scanner,"length");
        double width = GetInput(scanner,"width");
        double height = GetInput(scanner,"height");

        double totalArea = CalculateTotalArea(length, width, height);
        double gallonsRequired = totalArea / SQFT_PER_GAL;
        double price = gallonsRequired * PRICE_PER_GAL;

        System.out.println("Room Size: " + length + " x " + width + " x " + height + " ft");
        System.out.println("Total Area: " + totalArea + " sqft");
        System.out.println("Gallons Required: " + String.format("%.2f", gallonsRequired) + " gallon(s)");
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    public static double GetInput(Scanner scanner, String name)
    {
        double returnValue = 0.0;
        while (returnValue <= 0.0)
        {
            System.out.println("Input " + name + " (ft): ");
            returnValue = scanner.nextDouble();
        }
        return returnValue;
    }

    public static double CalculateTotalArea(double length, double width, double height)
    {
        return length * width + length * height * 2 + width * height * 2;
    }

}
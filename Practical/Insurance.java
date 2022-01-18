import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input birth year: ");
        int birthYear = scanner.nextInt();
        birthYear = Math.max(birthYear, 0);

        System.out.println("Input current year: ");
        int currentYear = scanner.nextInt();
        currentYear = Math.max(currentYear, birthYear);

        int yearDifference = currentYear - birthYear;
        double price = (yearDifference / 10 + 15) * 20;
        System.out.println("For a " + yearDifference + " years old, you need to pay $" + String.format("%.2f", price));
    }
}
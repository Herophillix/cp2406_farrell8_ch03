import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.next();
        double gpa = 0.0;
        while(gpa <= 0.0)
        {
            System.out.println("Input GPA: ");
            gpa = scanner.nextDouble();
        }

        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Credit Rewarded: $" + String.format("%.2f", gpa * 10));
    }
}
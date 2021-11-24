import java.util.Scanner;

public class MetricConversion {
    public static final double CM_PER_IN = 2.54;
    public static final double L_PER_GAL = 3.7854;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input integer: ");
        int input = scanner.nextInt();

        System.out.println(input + " inch(es) is equal to " + String.format("%.2f", input * CM_PER_IN) + " cm");
        System.out.println(input + " gallon(s) is equal to " + String.format("%.2f", input * L_PER_GAL) + " l");
    }
}
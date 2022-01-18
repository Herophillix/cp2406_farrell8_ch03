import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isInputValid = false;
        double numOne = 1.0, numTwo = 1.0;
        while(!isInputValid)
        {
            System.out.println("Input number 1: ");
            numOne = scanner.nextDouble();
            isInputValid = numOne > 0;
        }
        isInputValid = false;
        while(!isInputValid)
        {
            System.out.println("Input number 2: ");
            numTwo = scanner.nextDouble();
            isInputValid = numTwo > 0;
        }

        computePercent(numOne, numTwo);
        computePercent(numTwo, numOne);
    }

    public static void computePercent(double numOne, double numTwo)
    {
        double percentage = numOne / numTwo * 100;
        System.out.println(numOne + " is " + percentage + "% of " + numTwo);
    }
}
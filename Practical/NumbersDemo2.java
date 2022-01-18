import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number 1: ");
        int numOne = scanner.nextInt();
        System.out.println("Input number 2: ");
        int numTwo = scanner.nextInt();

        displayTwiceTheNumber(numOne);
        displayNumberPlusFive(numOne);
        displayNumberSquared(numOne);

        displayTwiceTheNumber(numTwo);
        displayNumberPlusFive(numTwo);
        displayNumberSquared(numTwo);
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println("Twice of " + num + " is " + num * 2);
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println(num + " plus 5 is " + num + 5);
    }

    public static void displayNumberSquared(int num) {
        System.out.println(num + " squared is " + num * num);
    }
}
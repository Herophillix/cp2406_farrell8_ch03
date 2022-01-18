public class NumbersDemo {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 5;

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
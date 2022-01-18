public class Percentages {
    public static void main(String[] args) {
        double numOne = 2.0;
        double numTwo = 5.0;

        computePercent(numOne, numTwo);
        computePercent(numTwo, numOne);
    }

    public static void computePercent(double numOne, double numTwo)
    {
        double percentage = numOne / numTwo * 100;
        System.out.println(numOne + " is " + percentage + "% of " + numTwo);
    }
}
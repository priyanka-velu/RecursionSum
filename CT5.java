import java.util.Scanner;

public class CT5 {
    public static double recursionSum(double[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        } 
        else {
            return numbers[index] + recursionSum(numbers, index + 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        int i;
        
        double[] numbers = new double[5];
        for (i = 0; i < 5; i++) {
            try {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Sorry, that was an invalid input. Please enter a number.");
                return;
            }
        }

        result = recursionSum(numbers, 0);

        System.out.println("The sum of your five numbers is " + result + ".");
    }
}

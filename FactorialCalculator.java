import java.util.Scanner;

public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for Factorial:");
        int getNonNegativeInteger = scanner.nextInt();

        if (getNonNegativeInteger < 0) {
            System.out.println("Number provided is negative: Invalid!");
        } else {
            System.out.println("The factorial of " + getNonNegativeInteger + " is " + calculateFactorial(getNonNegativeInteger));
        }
        
        scanner.close();
    }
}

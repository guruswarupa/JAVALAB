import java.util.Scanner;
//Custom exception class
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
public class Pgm8 {
    // Method to perform division and throw custom exception if denominator is zero
    static double divide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Cannot divide by zero!");
        }
        return (double) numerator / denominator;
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator and denominator ");
        int numerator = input.nextInt();
        int denominator = input.nextInt();
        try {
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
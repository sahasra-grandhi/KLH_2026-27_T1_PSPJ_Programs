

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        // Initialize two numbers for the calculations 
        int num1 = 15;
        int num2 = 4;

        // 1. Addition (+)
        int sum = num1 + num2;
        System.out.println("Addition of 2 numbers = " + sum);

        // 2. Subtraction (-)
        int difference = num1 - num2;
        System.out.println("Difference of 2 numbers = " + difference);

        // 3. Multiplication (*)
        int product = num1 * num2;
        System.out.println("Product of 2 numbers = " + product);

        // 4. Division (/)
        int quotient = num1 / num2;
        System.out.println("Division (/) = " + quotient);

        // 5. Modulus (%) - Returns the remainder of the division
        int remainder = num1 % num2;
        System.out.println("Remainder after Division = " + remainder);
 }
}
import java.util.*;
public class PrimeNo {
    public static void main(String [] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if (n<1)
            {
                System.out.println("Not a prime number");
                return;
            }
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    System.out.println("Not a prime number");
                    return;
                }
            }
            System.out.println("It's a prime number");
        }
    }
    }


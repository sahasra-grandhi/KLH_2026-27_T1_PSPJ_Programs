
import java.util.Scanner;

public class SwapNumbers 
{
    public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a value: ");
        int a = scanner.nextInt();

System.out.print("Enter b value: ");
        int b = scanner.nextInt();

System.out.println("a = " + a);
System.out.println("b = " + b);

int c = a;
 a = b;
 b = c;

System.out.println("a = " + a);
System.out.println("b = " + b);

scanner.close();
}
}







import java.util.Scanner;

public class Swap 
{
    public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a value: ");
        int a = scanner.nextInt();

System.out.print("Enter b value: ");
        int b = scanner.nextInt();

int c = a;
 a = b;
 b = c;
System.out.println("a =" + a);
System.out.println("b =" + c);
scanner.close();
}
}






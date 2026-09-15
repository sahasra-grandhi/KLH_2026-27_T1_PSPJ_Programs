import java.util.Scanner;
public class Char 
{
    public static void main(String[] args)
 {
 Scanner Scanner = new Scanner(System.in);
System.out.print("Enter int a value : ");
        int a = Scanner.nextInt();
System.out.print("Enter b value: ");
       char b = Scanner.next().charAt(0);
System.out.println("int = " + a);
System.out.println("int to char = " + b);
Scanner.close();
}
}



import java.util.Scanner;

public class Temp 
{
    public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);

System.out.print("Enter temp of celsius : ");
        int celsius = sc.nextInt();

System.out.print("Enter temp of fahrenheit : ");
        float fahrenheit = (celsius * 9/5)+ 32;

System.out.println("Celsius to Fahrenheit = " + fahrenheit);
sc.close();
}
}


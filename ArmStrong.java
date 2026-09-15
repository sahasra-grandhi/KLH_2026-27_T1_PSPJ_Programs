import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int org = n;
        int sum = 0;
        while(n>0)
        {
            int dig = n%10;
            sum = sum + dig*dig*dig;
            n=n/10;
        }
        if(sum==org)
        {
            System.out.println("ArmStrong");
        }
        else
        {
            System.out.println("Not ArmStrong");
        }
        sc.close();
    }
}
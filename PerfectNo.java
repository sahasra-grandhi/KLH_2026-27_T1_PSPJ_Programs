import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("The entered number " + n + " is a perfect number");
        } else {
            System.out.println("The entered number " + n + " is not a perfect number");
        }
        sc.close();
    }
}
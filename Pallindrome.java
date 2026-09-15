import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(org==rev) {
            System.out.println("The entered number " + org + " is a pallindrome");
        } else {
            System.out.println("The entered number " + org + " is not a pallindrome");
        }
        sc.close();
    }
}
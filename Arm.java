import java.util.Scanner;
public class Arm {
    public static void main(String[] args) {
        int no, temp,x,rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        no = sc.nextInt();
        temp = no;
        while(no>0) {
            x  = no%10;
            rev = rev + (x*x*x);
            no = no/10;
        }
        if(rev == temp) {
            System.out.println("The entered number " + temp + " is an Armstrong number");
        } else {
            System.out.println("The entered number " + temp + " is not an Armstrong number");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Salary
   {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic salary: ");

        int salary = sc.nextInt();

                   double HRA = salary * 0.20;

                   double DA = salary * 0.10;

        System.out.println("Basic Salary: " + salary);

        System.out.println("HRA: " + HRA);

        System.out.println("DA: " + DA);

        System.out.println("Net Salary: " + (salary + HRA + DA));

        sc.close();
       }
       } 
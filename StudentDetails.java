
import java.util.Scanner;

public class StudentDetails 
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
            
         System.out.print("Enter marks for Subject 1: ");
        float mark1 = scanner.nextFloat();

         System.out.print("Enter marks for Subject 2: ");
        float mark2 = scanner.nextFloat();
        
          System.out.print("Enter marks for Subject 3: ");
        float mark3 = scanner.nextFloat();


         float totalMarks = mark1 + mark2 + mark3;
        float percentage = (totalMarks / 300) * 100;

         System.out.println("         STUDENT DETAILS          ");
        System.out.println("Name        : " + name);
        System.out.println("Roll No.    : " + rollNo);
        System.out.println("Age         : " + age);
        System.out.println("Subject 1   : " + mark1);
        System.out.println("Subject 2   : " + mark2);
        System.out.println("Subject 3   : " + mark3);
        System.out.println("Total Marks : " + totalMarks + " / 300");
        System.out.println("Percentage  : " + percentage + "%");


        scanner.close();
    }
}
   

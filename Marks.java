import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.println( "Enter Your Name : ");
 String Name = sc.nextLine();
 System.out.println( "Enter Your Roll Number : ");
int Rollno = sc.nextInt();
 System.out.println( "Enter Your 1st Subject Marks : ");
int Marks1 = sc.nextInt();
 System.out.println( "Enter Your 2nd Subject Marks : ");
int Marks2 = sc.nextInt();
 System.out.println( "Enter Your 3rd Subject Marks : ");
int Marks3 = sc.nextInt();
System.out.println( "Enter Your 4th Subject Marks : ");
int Marks4 = sc.nextInt();
System.out.println( "Enter Your 5th Subject Marks : ");
int Marks5 = sc.nextInt();
int TotalMarks = Marks1 + Marks2 + Marks3 + Marks4 + Marks5;
int avg = TotalMarks / 5;
System.out.println( "Total Marks of " + Name + " is : " + TotalMarks);
System.out.println( "Average Marks of " + Name + " is : " + avg);
System.out.println("Name: " + Name);
System.out.println("Roll no: " + Rollno);
System.out.println("total marks: " + TotalMarks);
System.out.println("average marks: " + avg);
if (avg>= 90) {
    System.out.println("Grade: O");
} else if (avg >= 80) {
    System.out.println("Grade: A");
} else if (avg >= 70 || avg >= 80) {
    System.out.println("Grade: B");
} else if (avg >= 60|| avg >= 70) {
    System.out.println("Grade: C");}
    else if (avg>=50) {
            System.out.println("Grade: D");
} else {
    System.out.println("Grade: Fail");
}
sc.close();
}
    }

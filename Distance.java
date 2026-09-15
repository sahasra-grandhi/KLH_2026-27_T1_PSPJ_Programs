
import java.util.Scanner;

public class Distance

 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed of the vehicle (km/h): ");
        double speed = sc.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        double distance = speed * time;

        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Time: " + time + " hours");
        System.out.println("Distance traveled: " + distance + " km");

        sc.close();
    }
}
import java.util.*;
public class Power {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=2;
    int n=5;
    int power = 1;
    for(int i =1; i<=n; i++)
    {
        power = power * a;
    }
    System.out.println(power);
    sc.close();
}    
}


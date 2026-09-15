public class Fibonacci {
    public static void main (String[] args) {
        int t1 = 0;
        int t2 = 1;
        int t3;
        int num = 8;
        System.out.print(t1 + " " + t2);
        for (int i = 3; i < num; i++) {
            t3 = t1 + t2;
            System.out.print(" " + t3);
            t1 = t2;
            t2 = t3;
        }
    }
}
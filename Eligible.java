
public class Eligible
 {
    public static void main(String args[]) 
{
        int math1A = 69;
        int English = 190;
        int chemistry = 100;
        int physics = 110;
        int Sanskrit = 170;
        int math2A = 72;
        int math1B = 72;
        int math2B = 73;
        int practicals = 60;

        int sum = math1A + English + chemistry + physics + Sanskrit + math2A + math1B + math2B + practicals;

        // FIXED: 1000.0 triggers floating-point division
        double percentage = (sum / 1000.0) * 100;

        System.out.println("Total percent Student Got = " + percentage + "%");

        boolean isEligible = percentage > 80 && math1A > 65 && math2A > 65 && math1B > 65 && math2B > 65;

        if (isEligible) {
            System.out.println("True: Student is eligible for admission.");
        } else {
            System.out.println("False: Student is not eligible for Admission.");
        }
    } 
} 
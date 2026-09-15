public class Admission
{
public static void main (String args[])
{
int math1A = 80;
int English = 98;
int chemistry = 100;
int physics = 93;
int Sanskrit = 95;
int math2A = 90;
int math1B = 98;
int math2B = 99;
int practicals = 60;

int sum = math1A+English+chemistry+physics+Sanskrit+math2A+math1B+math2B+practicals;

System.out.println(" The Total Marks The Student Got = " +sum);

boolean a =sum>800;

System.out.println(" The Student is Eligible Or Not = " +a);

}
}
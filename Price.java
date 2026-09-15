public class Price 
{
    public static void main(String[] args)
    {
        int L = 45000;
        int M = 500;
        int K = 1500;

        int amount = L + M + K;
        System.out.println("Purchase amount=" + amount);

        double gstamount = amount * 0.18;
        double totalamount = amount + gstamount; 

        System.out.println("GST Amt=" + gstamount);
        System.out.println("Total cost with gst =" + totalamount);
    }
}
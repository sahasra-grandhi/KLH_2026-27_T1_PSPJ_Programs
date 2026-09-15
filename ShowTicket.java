public class ShowTicket {
    public static void main(String[] args) {
        
        String customerName = "G Sahasra";
        String showName = "Irumudi";
        int numberOfTickets = 4;
        int ticketPrice = 800;
        boolean isSeatAvailable = true;

        int totalTicketAmount = numberOfTickets * ticketPrice; 

        int discount = (totalTicketAmount >= 3000) ? 500 : 0; 
        int finalAmount = totalTicketAmount - discount; 

        System.out.println("Customer Name : " + customerName);
        System.out.println("Show Name : " + showName);
        System.out.println("Seat Availability : " + isSeatAvailable);
        System.out.println("Number of Tickets : "+ numberOfTickets);
        System.out.println("Ticket Price : " + ticketPrice);
        System.out.println("Total Ticket Amount : " + totalTicketAmount);
        System.out.println("Discount : "+ discount);
        System.out.println("Final Amount : " + finalAmount);
    }
}
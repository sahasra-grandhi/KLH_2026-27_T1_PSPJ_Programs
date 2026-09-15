public class RoomBooking {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 2; i++) {
            
            int roomTypeChoice = 2; 
            int NoOfDays = 3;   
            int NoOfRooms = 1;  
            
            String roomTypeName = "";
            int dailyRate = 0;

            switch (roomTypeChoice) {
                case 1: 
                    roomTypeName = "Standard Room"; 
                    dailyRate = 1500; 
                    break;
                case 2: 
                    roomTypeName = "Deluxe Room";   
                    dailyRate = 3500;
                    break;
                case 3: 
                    roomTypeName = "Suite Room";    
                    dailyRate = 6000; 
                    break;}
            int totalAmt = dailyRate * NoOfDays * NoOfRooms;
            String membership = "";
            if (totalAmt < 5000) {
                membership = "Basic";
            } else if (totalAmt <= 9999) {
                membership = "Silver";
            } else if (totalAmt <= 14999) {
                membership = "Gold"; 
            } else {
                membership = "Platinum";}
            System.out.println(roomTypeName);
            System.out.println("Membership: " + membership);
            System.out.println("Total Amount: " + totalAmt);
        }
    }
}
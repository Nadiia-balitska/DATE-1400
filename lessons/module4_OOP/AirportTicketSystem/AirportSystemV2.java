package module4_OOP.AirportTicketSystem;

public class AirportSystemV2 {
    public static void main(String[] args) {
        TicketV2 ticket1 = new TicketV2("Kari", "230020332", "Italy");
        ticket1.printTicketInfo();

        ticket1.setPessengerInfo("Kristian", "3928498294"); // and here we write the changes in variables
        ticket1.printTicketInfo();

        String destination = ticket1.getDestination(); // Access destination via getter

        // String destination = ticket1.destination; NOT CORRECT //I cannot access this because it is private
    }
}

package module4_OOP.AirportTicketSystem;

public class AirportSystemV1 {
    public static void main(String[] args) {
        TicketV1 ticket1 = new TicketV1("Kari", "230020332", "Italy");
        //task 1
        System.out.println(ticket1.name);
        System.out.println(ticket1.personNr);
        System.out.println(ticket1.destination);

        //task 2 
        ticket1.printTicketInfo(); 

        // task 3 
        TicketV1 ticket2 = new TicketV1("Per", "000992323", "Tromsø"); // if I want to change some information I need to create a new object 
        ticket2.printTicketInfo(); 

        TicketV1 ticket3 = new TicketV1("Faid", "993843784", "Portugal"); 
        ticket3.printTicketInfo(); 

        ticket1.name = "Kari Nordmann";
        ticket1.printTicketInfo(); 


    }
}

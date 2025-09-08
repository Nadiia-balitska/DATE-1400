package module4_OOP.AirportTicketSystem;

public class TicketV1 {
     String name;
    String personNr;
    String destination;

    public TicketV1(String name, String personeNr, String destination){
        this.name = name;
        this.personNr = personeNr;
        this.destination = destination;
    } 

    public void printTicketInfo(){ //if I just want to show some information so useI void 
        System.out.println("\nTicket info:");
        System.out.println("Name: " + this.name);
        System.out.println("PersonNr: " + this.personNr);
        System.out.println("Destination: " + this.destination);

    }
}

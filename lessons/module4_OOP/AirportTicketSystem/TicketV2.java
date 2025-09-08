package module4_OOP.AirportTicketSystem;

public class TicketV2 {
    private String name;
    private String personNr; 
    private String destination;

    public TicketV2(String name, String personNr, String destination){
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;
    }
     public void printTicketInfo() {

        System.out.println("\nTicket info:");
        System.out.println("Name: " + name);
        System.out.println("Person number: " + personNr);
        System.out.println("Destination: " + destination);
    }

    public void setPessengerInfo(String name,  String personNr) { // here we change the variables and it is why we write in breachets that what we wamt to change
        this.name = name;
        this.personNr = personNr;

    }

    public String getDestination() { // here we just want to get information it is wy we do not write anythink in breackets
      return this.destination;

    }
}

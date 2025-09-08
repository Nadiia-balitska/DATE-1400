package module4_OOP.AirportTicketSystem;

public class Ticket {
   String name;
    String personNr;
    String destination;

    public Ticket(String name, String personNr, String destination) {
    this.name = name;
    this.personNr = personNr;
    this.destination = destination;
}
public static void main(String[] args) {

  String ticket1Name = "Kari";
  String ticket1PersonNr = "230020332";
  String ticket1Destination = "Italy";
    System.out.println("Ticket info:");
    System.out.println("Name: " + ticket1Name);
    System.out.println("PersonNr: " + ticket1PersonNr);
    System.out.println("Destination: " + ticket1Destination);


  String ticket2Name = "Per";
  String ticket2PersonNr = "000992323";
  String ticket2Destination = "Spain";
    System.out.println("Ticket info:");
    System.out.println("Name: " + ticket2Name);
    System.out.println("PersonNr: " + ticket2PersonNr);
    System.out.println("Destination: " + ticket2Destination);


    String ticket3Name = "Tom";
      String ticket3PersonNr = "993843784";
  String ticket3Destination = "Portugal";
    System.out.println("Ticket info:");
    System.out.println("Name: " + ticket3Name);
    System.out.println("PersonNr: " + ticket3PersonNr);
    System.out.println("Destination: " + ticket3Destination);


  
    
}


Ticket ticket1 = new Ticket("Kari", "230020332", "Italy");
}
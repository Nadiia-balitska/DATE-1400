package lessons5_repetsjon;

public class Ticket {
    private int ticketNr;
    private static int nrOfTicketsPrinted = 0;
    
    public Ticket() {
        nrOfTicketsPrinted++;
        this.ticketNr = nrOfTicketsPrinted;
    }
}


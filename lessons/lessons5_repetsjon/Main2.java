package lessons5_repetsjon;

import lessons5_repetsjon.taxesandfees.Tax;

public class Main2 {
    public static void main(String[] args) {
    double passsengerFee = Tax.getPassengerFee();
    System.out.println("Passenger fee is: " + passsengerFee);

    double vat= Tax.computeVAT(1000);
    System.out.println("VAT for 1000 is: " + vat);


    }
}

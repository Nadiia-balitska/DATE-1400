package lessons5_repetsjon.taxesandfees;

public class Tax {
    private static double PASSENGER_FFE=60;
private static double VAT_RATE=0.25;

private Tax(){}
    public static double getPassengerFee(){
        return PASSENGER_FFE;
    }

    public static double computeVAT(double netPrice){
        double vat= netPrice * VAT_RATE;
        return vat; 
    }

}

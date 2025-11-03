package oving.dag1;

public class Oppgave2 {

    public static String findMonthByNumber(int i) {
         String mounth = switch (i) {     
            case 1-> "Januar"; 
            case 2-> "Februar"; 
            case 3-> "Mach"; 
            case 4-> "April"; 
            case 5-> "May"; 
            case 6-> "Jun"; 
            case 7-> "July"; 
            case 8-> "July"; 
            case 9-> "September"; 
            case 10-> "October"; 
            case 11-> "November"; 
            case 12-> "December"; 
            default -> "ingen mounth";

        };
        return mounth;
    }

    public static String findMonthByNumberArray(int i){

        String[] months ={
            "ingem måned", "januar", "februar","mars","april",
            "may","jun","july", "august","september", "october", "november", "december"
        };
        if (i >=months.length) {
            i = 0;
        }
        return months[i];
    }
    
}

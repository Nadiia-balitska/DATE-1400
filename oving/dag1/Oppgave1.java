package oving.dag1;

import static javax.swing.JOptionPane.*;
public class Oppgave1 {
    public static void main(String[] args) {
        
        
double number1 = 0;
double number2= 0;
String userInput1=" ";
String userInput2=" ";

do {
         userInput1=showInputDialog("Skriv inn et tall");
    
        try {
            number1 = Double.parseDouble(userInput1);

        } catch (Exception e) {
            System.out.println("Bruker input var ikke ett tall");
            break;
        }

         userInput2= showInputDialog("Skriv inn en annet tall");
        
         
        try {
             number2= Double.parseDouble(userInput2);

        } catch (Exception e) {
            System.out.println("Bruker input var ikke ett tall");
            break;

        }
        
        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Produktet: " + (number1 * number2));
        System.out.println("Differansen: " + (number1 - number2));


    }while(!userInput1.equals("q") && !userInput2.equals("q"));
}
}
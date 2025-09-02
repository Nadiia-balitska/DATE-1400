package module3;

import javax.swing.JOptionPane;

public class CastingExample2 {
    public static void main(String[] args) {
       String ageInput = JOptionPane.showInputDialog("Hvor gammel er du");

       try {
        int aga = Integer.parseInt(ageInput);
       } catch (Exception e) {

int age = 0;
JOptionPane.showMessageDialog(null, "Du ga ikke ett heltall");

       }
    }
}

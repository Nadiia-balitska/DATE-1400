package oving.dag1;

import java.util.ArrayList;

public class Ingredient {
    
       private  String name;
        private double amount;
       private  String Unit;

    public Ingredient(String name, Double amount, String Unit){
        this.name =name;
        this.amount= amount;
        this.Unit=Unit;
    }

    public String toString(){
        return "Beskrivelse:" + amount + Unit + name;
    };

    

        
    };

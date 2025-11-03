package oving.dag1;

import java.util.ArrayList;

public class FoodDish {
    private    String name;
    private ArrayList<Ingredient> ingredients;


 public FoodDish(String name){
this.name = name;
this.ingredients= new ArrayList<Ingredient>();
 }

 public void addIngredients(Ingredient ingredient){
    ingredients.add(ingredient);
 }


 public void printRecepie(){
    for (Ingredient ingredient : ingredients) {
        System.out.println(ingredient);
    }
 }


}

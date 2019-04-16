package sunday_roast;

import java.util.ArrayList;

public class SuperSecretSundayRoast {

    public SuperSecretSundayRoast(){
        guestList.add("Chicken");
    }

    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    ArrayList<String> guestList = new ArrayList<>();

    public void addIngredient(Ingredient i){
        if(guestList.contains(i.ingredientName)) {
            this.ingredients.add(i);
        }
        else {
            System.out.println("EXTERMINATE!");
        }
    }

//    public ArrayList<Ingredient> getIngredients(){
//
//        return this.ingredients;
//    }

    public ArrayList<Ingredient> getIngredients(String password){
        if(password.equals("strongpassword123")) {
            return this.ingredients;
        }
        else
            return null;
    }
}


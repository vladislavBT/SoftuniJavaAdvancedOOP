package EncapsulationExersice.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings=new ArrayList<>();
    private int numberOfToppings;

    public Pizza(String name, int numberOfToppings) throws Exception {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setName(String name) throws Exception {
        if(name.isEmpty() || name.isBlank() || name.length()>15){
            throw new Exception("Pizza name should be between 1 and 15 symbols.");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int numberOfToppings) throws Exception {
        if(numberOfToppings<=-1 || numberOfToppings>=11){
            throw new Exception("Number of toppings should be in range [0..10].");
        }else {
            this.numberOfToppings=numberOfToppings;
        }

    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double totalCalories=0.0;
        totalCalories+=this.dough.calculateCalories();
        for (int i = 0; i < this.toppings.size(); i++) {
            totalCalories+=toppings.get(i).calculateCalories();
        }
        return totalCalories;
    }
}

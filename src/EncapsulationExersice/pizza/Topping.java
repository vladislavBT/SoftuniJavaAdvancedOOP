package EncapsulationExersice.pizza;

public class Topping {
   private String toppingType;
   private double weight;

    public Topping(String toppingType, double weight) throws Exception {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) throws Exception {
        if(toppingType.equals("Meat")){
            this.toppingType=toppingType;
        }else if(toppingType.equals("Veggies")){
            this.toppingType = toppingType;
        } else if(toppingType.equals("Cheese")){
            this.toppingType = toppingType;
        }else if(toppingType.equals("Sauce")){
            this.toppingType = toppingType;
        }else {
            throw new Exception(String.format("Cannot place %s on top of your pizza.",toppingType));
        }
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateCalories(){
        double base = this.weight*2;
        if(this.toppingType.equals("Meat")){
            return base*1.2;
        }else if(this.toppingType.equals("Veggies")){
            return base*0.8;
        }else if(this.toppingType.equals("Cheese")){
            return base*1.1;
        }else if(this.toppingType.equals("Sauce")){
            return base*0.9;
        }
        return 0;
    }
}

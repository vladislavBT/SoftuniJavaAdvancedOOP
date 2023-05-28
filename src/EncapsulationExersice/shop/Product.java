package EncapsulationExersice.shop;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public void setName(String name) {
        if(name.isEmpty() && name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else {
            this.cost = cost;
        }
    }
}

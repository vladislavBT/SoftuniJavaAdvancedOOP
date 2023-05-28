package EncapsulationExersice.shop;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products=new ArrayList<>();

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }

    private void setName(String name) {
        if(name.isEmpty() || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }else {
            this.money = money;
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) throws Exception {
        if(this.money>=product.getCost()){
            this.products.add(product);
            this.money-= product.getCost();
            System.out.printf("%s - %s%n", this.getName(), product.getName());
        }else {
            throw new Exception(String.format("%s can't afford %s",this.getName(),product.getName()));
        }
    }
}

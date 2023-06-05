package Polymorphism;

import java.text.DecimalFormat;

public class Car {
    private double fuelQuantity;
    private double fuelConsumption;
    private double drivenDistance;
    private double tankCapacity;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity=tankCapacity;
    }

    private DecimalFormat df = new DecimalFormat("#.##");

    public String driveCar(double kilometers){
        if(kilometers<=0){
            return "";
        }
        if(kilometers*(fuelConsumption+0.9)<=fuelQuantity){
            drivenDistance+=kilometers;
            fuelQuantity-=kilometers*(fuelConsumption+0.9);
            return "Car travelled " +df.format(kilometers)+ " km";
        }  else {
            return String.format("Car needs refueling");
        }
    }

    public void refuelCar(double fuel){
        if(fuel<=0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if(fuelQuantity+fuel>tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        }else {
            fuelQuantity += fuel;
        }
    }

    public double getDrivenDistance() {
        return drivenDistance;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}

package PolymorphismExercise.Vehicles;

import java.text.DecimalFormat;

public class Truck {
    private double fuelQuantity;
    private double fuelConsumption;
    private double drivenDistance;
    private double tankCapacity;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity= tankCapacity;
    }

    private DecimalFormat df = new DecimalFormat("#.##");
    public String driveTruck(double kilometers){
        if(kilometers*(fuelConsumption+1.6)<=fuelQuantity){
            drivenDistance+=kilometers;
            fuelQuantity-=kilometers*(fuelConsumption+1.6);
            return "Truck travelled " +df.format(kilometers)+ " km";
        }  else {
            return String.format("Truck needs refueling");
        }
    }

    public void refuelTruck(double fuel){
        if(fuel<=0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if(fuelQuantity+fuel>tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        }else {
            fuelQuantity += (fuel*0.95);
        }
    }

    public double getDrivenDistance() {
        return drivenDistance;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
}

package Polymorphism;

import java.text.DecimalFormat;

public class Bus {
    private double fuelQuantity;
    private double fuelConsumption;
    private double drivenDistance;
    private double tankCapacity;

    public Bus(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity=tankCapacity;
    }

    private DecimalFormat df = new DecimalFormat("#.##");
    public String driveEmptyBus(double kilometers){
        if(kilometers*fuelConsumption<=fuelQuantity){
            drivenDistance+=kilometers;
            fuelQuantity-=kilometers*fuelConsumption;
            return "Bus travelled " +df.format(kilometers)+ " km";
        }  else {
            return String.format("Bus needs refueling");
        }
    }

    public String driveBus(double kilometers){
        if(kilometers*(fuelConsumption+1.4)<=fuelQuantity){
            drivenDistance+=kilometers;
            fuelQuantity-=kilometers*(fuelConsumption+1.4);
            return "Bus travelled " +df.format(kilometers)+ " km";
        }  else {
            return String.format("Bus needs refueling");
        }
    }

    public void refuelBus(double fuel){
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

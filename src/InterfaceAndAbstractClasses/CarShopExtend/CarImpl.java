package InterfaceAndAbstractClasses.CarShopExtend;

public class CarImpl implements Car {
    String model;
    String color;
    int horsePower;
    String countryProduced;

    public CarImpl(String model, String color, int horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    public String toString(){
        return String.format("This is %s produced in %s and have 4 tires",getModel(),getCountryProduced());
    }
}

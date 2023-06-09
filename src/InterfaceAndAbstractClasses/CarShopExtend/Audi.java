package InterfaceAndAbstractClasses.CarShopExtend;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    public Integer getMinRentDay() {
        return minRentDay;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString(){
        return String.format("%s%nMinimum rental period of %d days. Price per day %f",super.toString(),getMinRentDay(),getPricePerDay());
    }
}

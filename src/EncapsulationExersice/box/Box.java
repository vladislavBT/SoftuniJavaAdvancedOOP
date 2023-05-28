package EncapsulationExersice;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }else {
            this.height = height;
        }
    }

    public double calculateSurfaceArea(){
        double surfaceArea= 2*(this.width*this.height+this.height*this.length+this.length*this.width);
        return surfaceArea;
    }

    public double calculateLateralSurfaceArea (){
        double lateralSurfaceArea = 2*(this.width*this.height+this.height*this.length);
        return lateralSurfaceArea;
    }

    public double calculateVolume (){
        double volume = this.width*this.length*this.height;
        return volume;
    }
}

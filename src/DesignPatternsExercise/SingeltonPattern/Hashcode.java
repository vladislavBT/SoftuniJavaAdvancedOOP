package DesignPatternsExercise.SingeltonPattern;

public class Hashcode {
    private static Hashcode instance;
    private String point;


    private Hashcode(String point) {
        this.point = point;
    }

    public String getPoint() {
        return point;
    }

    public static Hashcode getInstance(){
        if(instance==null){
            return new Hashcode("Pesho");
        }
        return instance;
    }

}

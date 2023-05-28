package EncapsulationExersice.pizza;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) throws Exception {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) throws Exception {
        if(flourType.equals("White")){
           this.flourType=flourType;
        }else if(flourType.equals("Wholegrain")){
            this.flourType = flourType;
        }else {
            throw new Exception("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) throws Exception {
        if(bakingTechnique.equals("Crispy")){
            this.bakingTechnique = bakingTechnique;
        }else if(bakingTechnique.equals("Chewy")){
            this.bakingTechnique = bakingTechnique;
        }else if(bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }else {
            throw new Exception("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) throws Exception {
        if(weight>=1 && weight<=200) {
            this.weight = weight;
        }else {
            throw new Exception("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories(){
        double base = this.weight*2;
        if(this.flourType.equals("White")){
            base= base*1.5;
        }else if(this.flourType.equals("Wholegrain")){
            base=base*1;
        }
        if(this.bakingTechnique.equals("Crispy")){
            return base*0.9;
        }else if(this.bakingTechnique.equals("Chewy")){
            return base*1.1;
        }else if(this.bakingTechnique.equals("Homemade")){
            return base*1;
        }
        return 0;
    }
}

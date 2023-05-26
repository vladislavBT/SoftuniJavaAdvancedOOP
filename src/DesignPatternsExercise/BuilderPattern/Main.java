package DesignPatternsExercise.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Person person =Person.builder()
                .setName("Pesho")
                .setAge(15)
                .setAddress("ul.IvanGeshov")
                .build();

        System.out.println(person.toString());
    }



}

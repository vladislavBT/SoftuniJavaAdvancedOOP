package DesignPatternsExercise.BuilderPattern;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        String name;
        int age;
        String address;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this.name,this.age,this.address);
        }

    }

    public String toString(){
        return this.name+this.address+this.age;
    }
}

package animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) throws Exception {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Woof!";
    }
}

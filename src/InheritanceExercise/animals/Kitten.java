package animals;

public class Kitten extends Cat{
    public Kitten(String name, int age, String gender) throws Exception{
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Meow";
    }
}

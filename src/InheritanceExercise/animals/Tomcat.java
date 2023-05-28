package animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age, String gender) throws Exception{
        super(name, age, gender);
    }
    @Override
    public String produceSound(){
        return "MEOW";
    }
}

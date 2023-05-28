package animals;

public class Animal {
    String name;
    int age;
    String gender;

    public Animal(String name, int age, String gender) throws Exception {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) throws Exception {
        if(name.isBlank()){
            throw new Exception("Invalid input!");
        }else {
            this.name = name;
        }
    }

    public void setAge(int age) throws Exception {
        if(age<=0){
            throw new Exception("Invalid input!");
        }else {
            this.age = age;
        }
    }

    public void setGender(String gender) throws Exception {
        if(gender.isBlank()){
            throw new Exception("Invalid input!");
        }else {
            this.gender = gender;
        }
    }
    public String produceSound(){
        return "";
    }
}

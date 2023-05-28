package Encapsulation;

public class Person {
   private String name;
   private String lastName;
   private int age;
   private double salary;

    public Person(String name, String lastName, int age,double salary) {
        setName(name);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name.length()<3){
            throw new IllegalArgumentException("Invalid firstName");
        }else {
            this.name = name;
        }
    }

    public void setLastName(String lastName) {
        if(lastName.length()<3){
            throw new IllegalArgumentException("Invalid firstName");
        }else {
            this.lastName = lastName;
        }
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Invalid age");
        }else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary invalid");
        }else{
            this.salary = salary;
        }

    }

    public void increaseSalary(double percentage){
        if(this.getAge()<30){
            this.setSalary(this.getSalary() + (this.getSalary()*percentage/200));
        }else {
            this.setSalary(this.getSalary() + (this.getSalary()*percentage/100));
        }
    }

    @Override
    public String toString(){
        return String.format("%s %s is %d years old.",getName(),getLastName(),getAge());
    }
}

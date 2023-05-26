package DesignPatternsExercise.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        EmployeeRecord employee = new EmployeeRecord(15, "Pesho", "PePi", 15.0, "ul.Jele");
        EmployeeRecord employee2 = employee.getClone();
        employee2.showRecord();
    }
}
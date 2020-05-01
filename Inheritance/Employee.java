package Inheritance;

public class Employee extends Person {
    private double Salary;
    Employee(String name, String id , double Salary) {
        super(name,id);
        this.Salary = Salary;
    }
}
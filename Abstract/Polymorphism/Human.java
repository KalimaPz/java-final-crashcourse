package Abstract.Polymorphism;

public class Human {
    private String name;
    private int age;

    Human(String n , int a){
        name = n;
        age = a;
    }

    public void Introduce(){
        System.out.println("Hello My name is "+ name);
        System.out.println("i am "+age);
    }
}
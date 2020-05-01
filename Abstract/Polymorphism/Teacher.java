package Abstract.Polymorphism;

public class Teacher extends Human {
    Teacher(String n,int a){
        super(n, a);
    }

    @Override
    public void Introduce(){
        System.out.println("I am Teacher");
    }
}
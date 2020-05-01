package Abstract.Interface;

public class Car implements Vehicle {

    private int Speed;
    private int fuel;
    Car(){

    }
    @Override   
    public void SpeedUp() {
        this.Speed += 10;
    }
    @Override   
    public void SlowDown(){
        this.Speed -= 10;
    }
    @Override   
    public void FillFuel(int quality){
        this.fuel += quality;
    }

    public void getData(){
        System.out.println(Speed);
        System.out.println(fuel);
    }   
}
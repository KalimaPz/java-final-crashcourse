package Abstract;

public class Square extends Shape {
    private double side_length;
    
    Square(double leng){
        this.side_length = leng;
    }

    @Override
    public void calArea() {
        area = side_length*side_length;
    }
}
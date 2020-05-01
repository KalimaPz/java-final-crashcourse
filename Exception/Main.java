package Exception;

public class Main {
    public static void main(String[] args) {
        int x = 50;
        int y = 0;

        try {
            System.out.println(SafeDiv(x,y));
        }
        catch(DivByTwoException db2){
            System.out.println("Error Div by 2");
        }

        catch(ArithmeticException ex){
            System.out.println("Error Div by Zero");
        }
        
    }
    public static int SafeDiv(int x , int y) throws DivByTwoException {
        if(y == 2) {
            throw new DivByTwoException();
        } 
        else
            return x / y;
    }
}
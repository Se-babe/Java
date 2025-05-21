public class Exception2{

    public static void divideByZero(){
        throw new ArithmeticException("this is the error");
        }
        
        
    
    public static void main(String[] args) {
        divideByZero();
    }
}
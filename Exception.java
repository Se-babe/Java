public class Exception {
    public static void main(String[] args) {
        try {
            int divideByZero=5/0;
            System.out.println("this is the exception class");
        } catch (ArithmeticException e) {
            System.out.println("this is an arithmetic exception"+e.getMessage());
        }
    }
}
//use of try catch block
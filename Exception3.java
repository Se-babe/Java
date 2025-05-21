
import java.io.*;


public class Exception3{

    static int divideByZero(int a,int b){
        int i =a/b;
        return i;
    }
    static int computeDivision(int a,int b){
        int result = 0;

        try{
            result=divideByZero(int a, int b);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
}
    


public class Exception{

    public Exception(String message) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
          //  e.printStackTrace();
         // System.out.println(e.toString());
         System.out.println(e.getMessage());
        }
    }

    public void printStackTrace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStackTrace'");
    }
}
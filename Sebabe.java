public class Sebabe {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        
        catch(ArithmeticException e){
          // e.printStackTrace();
           System.out.println(e.getMessage());
           System.out.println(e.toString());

        }
        

    }
}

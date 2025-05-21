public class Disc {
    public static void main(String[] args) {
        try{
            int l=10/0;
            throw new MyException("throw this ");
        }
        
        catch(MyException e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}
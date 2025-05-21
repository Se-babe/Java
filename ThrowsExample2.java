public class ThrowsExample2{
    
    public static void checkAge(int age)throws ThrowsExample{
        if(age<18){
        throw new ThrowsExample("the age is invalid");
  
        }
        System.out.println("invalid age ");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ThrowsExample e) {
            e.printStackTrace();
        }catch(NumberFormatException r){
            r.printStackTrace();
        }finally{
            System.out.println("the error had to occur");
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
        try {
            String text=null;
            System.out.println(text.length());
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
        System.out.println("the"+e.getMessage());
        }
    }
}

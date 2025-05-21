public class Female {
   public static void main(String[] args) {
    
    try {
        throw new Male();


    } catch (IndexOutOfBoundsException | Male e) {
        System.out.println(e.getMessage());
    }
   } 
}

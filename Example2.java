public class Example2 {
}
    public static void main(String[] args) {
        try {
            int [] student={1,2,3};
            System.out.println(student[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("the error must occur");
        }
    }


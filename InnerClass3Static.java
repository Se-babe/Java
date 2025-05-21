public class InnerClass3Static {
    
    private static void show(){
        System.out.println("this is the outer method8");
    }
    class Inner4{

        public static void display(){
            System.out.println("this is the inner method");
            show();
        }
    }
    public static void main(String[] args) {
        InnerClass3Static.Inner4.display();
    }
}

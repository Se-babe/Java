public class A {
    A(){
        System.out.println("constructor of a called");
    }
    // A(String x){
    //     super();
    //     System.out.println("constructor of a called"+x);
    // }
}
    class B extends A{
        B(){
            super();
            System.out.println("constructor of B being called");
        }
    }
    class C extends B {
        C(){
            super();
            System.out.println("constructor C being called");
        }
    }
    public static void main(String[] args){
        // C obj = new C();
        
    }

 
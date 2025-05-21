public class InnerClass2LocalInner {
    
    void InnerClass2Method(){

        System.out.println("this is the outer method");

        class Inner3{
            void Inner3Method(){
                System.out.println("tis is the inner method");
            }
        }
        Inner3 obj =new Inner3();
        obj.Inner3Method();
    }
    public static void main(String[] args) {
        InnerClass2LocalInner obj1 =new InnerClass2LocalInner();
        obj1.InnerClass2Method();
    }
}

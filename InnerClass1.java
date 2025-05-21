//Nested inner class
public class InnerClass1 {
    
    
    
    class Inner{

        public void show(){
            System.out.println("the method of the inner class");
        }
    }
    

    public static void main(String[] args){
        InnerClass1.Inner obj=new InnerClass1().new Inner();
        obj.show();
    }
//Note:  We can not have a static method in a nested inner class because an inner class is implicitly associated with an object of its outer class so it cannot define any static method for itself. 
}
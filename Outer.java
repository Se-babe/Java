public class Outer {

     public void show(){
        System.out.println("this is amazing");
     }
     public class Inner{
        public void display(){
            System.out.println("this is for sure interesting");
        }
     }
     public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.display();
     }
}
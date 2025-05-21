public class Mutable1 {
    private String name;
   private int age;

   public Mutable1(String name,int age){
    this.name=name;
    this.age=age;
   }
   public String getName(){
    return name;
   }
   public int getAge(){
    return age;
   }
   public void setName(String name){
    this.name=name;
    
   }
   public void setAge(int age){
    this.age=age;
   }
   public static void main(String[] args) {
    Mutable1 obj=new Mutable1("swale", 23);
    System.out.println("name: "+obj.getName()+" age: " + obj.getAge());
   }
}

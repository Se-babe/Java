public final class Immutable1{
    private final String name;
    private final int age;

    public Immutable1(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
public static void main(String[] args) {
    Immutable1 obj =new Immutable1("swale", 67);
    System.out.println("name:" + obj.getName()  +  " age:"+obj.getAge());
   // System.out.println(obj.getAge());
}
}
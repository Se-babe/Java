public class Stude<T>{
    T name;
    

    public Stude(T name){
        this.name = name;
    }



    // public void printName(String name){
    //     System.out.println(name);
    // }
    public T printName(T name){
        return name;
    }


    public static void main(String[] args) {
        Stude<String> sobj1 = new Stude<String>("hello");
        //sobj1.printName("amadile");
        System.out.println(sobj1.printName("hello"));

        Stude<Integer> iobj1 = new Stude<Integer>(5);
        //iobj1.printName("sebabe");
        System.out.println(iobj1.printName(5));

        Stude <Double> jobj1 = new Stude<Double>(7.9);
        //jobj1.printName("swale");
        System.out.println(jobj1.printName(7.9));
    }
}
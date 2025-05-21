public class Generic <T,N>{
    T name;
    N age;
    

    public Generic(T name, N age){
        this.name = name;
        this.age=age;
    }



    // public void printName(String name){
    //     System.out.println(name);
    // }
    public static <N> void printName(N element){
         System.out.println(element);
    }


    public static void main(String[] args) {
        //Generic<String, Double> sobj1 = new Generic<String, Double>("sebabe", 56.9);
        //sobj1.printName("amadile");
        printName(6.9);

        //Generic<Integer, String> iobj1 = new Generic<Integer, String>(5,"9.7");
        //iobj1.printName("sebabe");
        printName("5");

        //Generic <Double, Double> jobj1 = new Generic<Double, Double>(7.9, 0.8);
        //jobj1.printName("swale");
        printName(7.9);
    }
}
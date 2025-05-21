public class Sheep {
    public static void main(String[] args) {
        
        try {
            int [] number={2,3,5};
           // int value  =number[3];
            System.out.println(number[4]);
            throw new Goat("exception error");
            // String name=null;
            // int num=name.length();
            // throw new Goat("name");
        }    
            
                                        
         catch(Goat e) {
                System.out.println("Custom error :cannot print the length"+ e.getMessage());
                
        }


        catch(ArrayIndexOutOfBoundsException r){
            System.out.println("the error resolved"+r.getMessage());
        

        }
    }
}
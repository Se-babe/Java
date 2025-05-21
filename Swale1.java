import java.io.*;

public class Swale1 {
    public static void main(String[] args) {
     try{  
         int student[]=new int{5,8,6};
         int value=student[4];
        
        throw  new Swale("message");
     }
     catch(Swale e){
        e.printStackTrace();
     }catch(NullPointerException r){
        r.printStackTrace();
     }
    }
}

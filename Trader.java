import java.io.*;

public class Trader implements Serializable {
        String TraderID;
        String name;
        String location;

        
        public Trader(String TraderID,String name,String location){
            this.TraderID=TraderID;
            this.name=name;
            this.location=location;
        }


        public static void main(String[] args) {
            Trader obj = new Trader("q1009", "sebabe", "mak");
            try {
                FileOutputStream fos = new FileOutputStream("traders.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(obj);
                oos.close();
                fos.close();
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
                
            }
            
        }
}

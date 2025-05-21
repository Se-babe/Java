import java.io.*;

public class DeserializationTrader {
        public static void main(String[] args) {
            Trader obj=null;
            try {
                
                FileInputStream fis =new FileInputStream("traders.txt");
                ObjectInputStream ois=new ObjectInputStream(fis);
                obj=(Trader)ois.readObject();
                ois.close();
                fis.close();
                System.out.println("trader ID"  +obj.TraderID);
                System.out.println("name "  +obj.name);
                System.out.println("location"  +obj.location);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
}

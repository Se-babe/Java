import java.io.*;

public class TryWithResource {
    static BufferedReader reader;
    
        public static void main(String[] args) {
            try(BufferedReader obj = new BufferedReader(new FileReader("word.txt"))) {
                
                            System.out.println(obj.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

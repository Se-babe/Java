import java.io.*;
//use of throws 
public class Exception3 {
    
    public static void findFile()throws IOException {
        File obj=new File("example.txt");
        FileInputStream fis=new FileInputStream(obj);
    }
    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());

        }
    }
}

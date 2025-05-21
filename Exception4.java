import java.io.*;

public class Exception4 {
    public static void fileReader() throws IOException{
        FileReader fr = new FileReader("example.txt");
        BufferedReader br=new BufferedReader(fr);
    }
    public static void main(String[] args) {
        try {
            fileReader();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

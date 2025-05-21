
import java.io.*;
public class FileRead{

public static void main(String [] tty) throws FileNotFoundException{

BufferedReader b=null;
String s=null;
System.out.println("reading from a file ");
b = new BufferedReader(new InputStreamReader(new FileInputStream("my.xlsx")));
try{
s = b.readLine();
System.out.println("we read string"+s);
}catch(IOException ex){
System.out.println("Error"+ex.getMessage());
}






}







}
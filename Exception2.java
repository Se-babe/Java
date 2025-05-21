
//checked exception where fileNotFoundException does not exist

import java.io.*;


public class Exception2{

    public static void main(String[] args) throws IOException {
        //creating an empty string
       // String str = null;
        //System.out.println(str.length());
        // try{
        //     String str=null;
        //     System.out.println(str.charAt(0));
        // }catch(NullPointerException e){
        //     System.out.println("nullpointerexception");
        // }
        FileReader file = new FileReader("c:\\document\\muysa\\Agenda.docx");
        BufferedReader fileInput =new BufferedReader(file);
        for(int counter=0;counter<3;counter++);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
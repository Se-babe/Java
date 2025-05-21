
import java.io.*;
public class person implements Serializable{

    int age;
    String name;
    double height;

    public Person(int age,String name,double height){
        this.age=age;
        this.name=name;
        this.height=height;
    }

public static void main(String []args){
    Person obj=new Person(20,"swale",39.7);
    try {
        FileOutputStream fos=new FileOutputStream("table.txt");
        ObjectOutStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        fos.close();
        oos.close();
        System.out.println("Serialization was successfully implemented");
    } catch (IOException e) {
        e.printStackTrace();
    }
    // try {
    //     Person obj1=null;
    //     FileInputStream fis = new FileInputStream("table.txt");
    //     ObjectInputStream ois=new ObjectInputStream(fis);
    //     obj1=(Person)ois.readObject();
    //     fis.close();
    //     ois.close();
    //     System.out.println("age is "+obj1.age+"name is"+obj1.name+"height is"+obj1.height);

    // } catch (IOException e) {
    //     e.printStackTrace();
    // }catch(ClassNotFoundException e){
    //     e.printStackTrace();

    // }




}
}
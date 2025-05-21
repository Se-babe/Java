import java.io.*;

public class AAbdu implements Externalizable{

    int age;
    String name;
    double height;
    public AAbdu(){
        System.out.println("this is the no-arg constructor");
    }

    public AAbdu(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public void writeExternal(ObjectOutput out)throws IOException{
        out.writeInt(age);
        out.writeObject(name);
        out.writeDouble(height);
    }
    public void readExternal(ObjectInput in)throws IOException ,ClassNotFoundException{
        age=in.readInt();
        name=(String)in.readObject();
        height=in.readDouble();
    }

    public static void main(String[] args) {
        AAbdu obj = new AAbdu(20, "kaaaaaa", 45.7);
        
        // Serialization
        try {
            FileOutputStream fos = new FileOutputStream("table.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            fos.close();
            oos.close();
            System.out.println("Serialization was successfully implemented");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            AAbdu obj1 = null;
            FileInputStream fis = new FileInputStream("table.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj1 = (AAbdu) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Age: " + obj1.age + ", Name: " + obj1.name + ", Height: " + obj1.height);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

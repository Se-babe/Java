import java.io.*;
public class TraderExternalizable implements Externalizable {

    
        String TraderID;
        int age;
        double location;

        public TraderExternalizable(){
            System.out.println("this is the no argument constructor");
        }
        public TraderExternalizable(String TraderID,int age,double location){
            this.TraderID=TraderID;
            this.age=age;
            this.location=location;
        }
         public void writeExternal(ObjectOutput out)throws IOException{
            out.writeObject(TraderID);
            out.writeInt(age);
            out.writeDouble(location);
         }
         public void readExternal(ObjectInput in)throws IOException ,ClassNotFoundException{
            TraderID=(String)in.readObject();//readUTF()
            age=in.readInt();
            location=in.readDouble();
}
    
}

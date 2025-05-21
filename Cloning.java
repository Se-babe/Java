public class Cloning implements Cloneable{
    int x;
    int y;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
     public static void main(String[] args) throws CloneNotSupportedException{
        Cloning obj1 = new Cloning();
        Cloning obj2= (Cloning)obj1.clone();
        
     }
}
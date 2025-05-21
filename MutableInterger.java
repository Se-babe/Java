public class MutableInterger{

    private int x;
    private int y;

    public MutableInterger(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
    return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void display(){
        System.out.println("x="+x +"y="+y);
    }
public static void main(String[] args) {
    MutableInterger obj=new MutableInterger(2, 8);
    obj.display();
    obj.setX(34);
    obj.setY(67);
    obj.display();
}
}
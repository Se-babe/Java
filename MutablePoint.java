public class MutablePoint{
    private  int x;
    private  int y;
    //private String z;

    public MutablePoint(int x,int y){
        this.x=x;
        this.y=y;
        //this.z = z;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    // public int getZ(){
    //     return z;
    // }
    // public void setZ(int z){
    //     this.z = z;
    // }

    public static void main(String[] args){
        MutablePoint point = new MutablePoint(2, 4);
        System.out.println("x:" + point.getX());
        System.out.println("y:" + point.getY());
        //System.out.println("z:" + point.getZ());

        point.setX(15);
        point.setY(20);
       // point.setZ(30);

        System.out.println("updated X:" + point.getX());
        System.out.println("updated Y:" + point.getY());
        //System.out.println("updated Z:" + point.getZ());

    }

}
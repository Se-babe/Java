

public class Chield extends Parent {
    public void display(){
        System.out.println("this mehod  is called");
    }
    public static void main(String[] args) {
        Parent p = new Chield();

        p.show();

        if(p instanceof Chield){
            Chield p1 = (Chield)p;
            p1.display();
        }else {
            System.out.println("explicit casting not possible");
        }
    }
}

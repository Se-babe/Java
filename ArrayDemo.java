public class ArrayDemo {
    //adding an element in an array
    public void arrayDemo(){
        int[]ArrayDemo=new int[5];
        ArrayDemo[0]=4;
        ArrayDemo[1]=9;
        ArrayDemo[2]=8;
        ArrayDemo[3]=6;
        ArrayDemo[4]=7;
        ArrayDemo[1]=70;

        
        
    
    
    for(int i=0;i<ArrayDemo.length;i++){
        System.out.println("index "+i+",element "+ArrayDemo[i]);
        
    }
    //to determine the size of an array
   // System.out.println(ArrayDemo.length);
    //to print the last element in an array
    //System.out.println(ArrayDemo[ArrayDemo.length-1]);
}
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        obj.arrayDemo();
    }
}

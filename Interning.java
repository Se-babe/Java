public class Interning{
    public static void main(String[] args) {
        String s1="you";// s1 and s2 are string literals stored in a string constant pool which is a part of heap memory
        String s2="you";
        System.out.println(s1==s2);
        // == compares references and returns true if the references are the same
        System.out.println(s1.equals(s2));// .equal() compares the values or character sequences of string literals

        String s3=new String("you"); // s3 is  string object stored in a heap memory
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String s4=new String("you");
        //Before interning using intern method by a programmer
        System.out.println(s2==s4);
        //After interning
        s4=s4.intern();
        System.out.println(s2==s4);//

        String s5= new String("buddy").intern();
        String s6= new String("buddy").intern();
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        }
    }
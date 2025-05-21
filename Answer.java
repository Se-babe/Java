public class Answer {
   public static void main(String[] args) {
     try{
        //int result=10/0;
        int[]student= {1,2,3};
        System.out.println(student[5]);
        throw new Question("the exception class ");
        
    }catch(Question e){
       System.out.println(); 
    }catch(ArithmeticException e){
        e.printStackTrace();
    }
}
}
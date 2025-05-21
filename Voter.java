public class Voter{
    public void vote(int age)throws UnderAgeException{
        if(age < 18){
            throw new UnderAgeException("the error in the prog");
        }else
        System.out.println("the exception class");
    }
}
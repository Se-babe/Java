public class Address {
    String city;
    String state;

    Address(String city , String state){
    this.city=city;
    this.state=state;
}   
}
class Person implements Cloneable{
    String name;
    int age;
    Address address;

    Person(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();  // performing shallow clone
    }
        public static void main(String[] args) {
            try{
                Address address = new Address("arua","AR");
                Person person1 = new Person("swale",25,address);
                 
                //clone object
                Person person2 = (Person)person1.clone();
                //displaying original and cloned objects
                System.out.println("person1"+person1.name +","+person1.address.city);
                System.out.println("person2"+person2.name+","+person2.address.city);
                
                //changing the address
                person2.address.city="yumbe";
                //displaying the modification
                System.out.println("after modification");
                System.out.println("person1"+ person1.name+","+person1.address.city);
                System.out.println("person2"+ person2.name+","+person2.address.city);
            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
        }
}

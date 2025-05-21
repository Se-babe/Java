
import java.io.*;
import java.util.*;
public class Employee implements Serializable {
	 final String name;
	 public transient int employeeId;
	 static double age;
	
	public Employee(String name, int employeeId ,double age) {
		this.name=name;
		this.employeeId=employeeId;
		Employee.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the Employee");
		String EmpName=scan.nextLine();
		System.out.println("Enter the id of the Employee");
		int ID=scan.nextInt();
		System.out.println("Enter the age of the Employee");
		double age=scan.nextDouble();
		Employee emp=new Employee(EmpName, ID, age);
		
		String file="example.txt";
		//Serialization
		try {
			//FileOutputStream fos=new FileOutputStream("example.txt");
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(emp);
			oos.close();
			//fos.close();
			System.out.println("The object has been serialized successfully");
		}
		catch(IOException m) {
			m.printStackTrace();
		}
		
		//deserialisation
		Employee obj1=null;
		try {
			FileInputStream fis =new FileInputStream("example.txt");
			ObjectInputStream ois =new ObjectInputStream(fis);
			
			obj1=(Employee)ois.readObject();
			fis.close();
			ois.close();
			//System.out.println("deserialization successfully");
			System.out.println(obj1.name);
			System.out.println(obj1.employeeId);
			System.out.println(obj1.age);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	}
}

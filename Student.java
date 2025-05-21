import java.io.*;


public class Student implements Serializable {
	int age;
	String name;
	
	public Student(int age ,String name) {
		this.age=age;
		this.name=name;
				}
	
	

	public static void main(String[] args)  {
		Student obj = new Student(34,"swale");
		// Scanner scan =new Scanner(System.in);
		// System.out.println("let the user enter its first credentials ie age");
		// int age=scan.nextInt();
		// scan.nextLine();
		// System.out.println("let the user enter its second credentials ie name");
		// String name=scan.nextLine();

		
		
		//serialization
		try {
			FileOutputStream fos=new FileOutputStream("example.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("serialization successfully implemented");
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		//deserialization
		try{
			Student obj1=null;
		FileInputStream fis=new FileInputStream("example.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		obj1=(Student)ois.readObject();
		fis.close();
		ois.close();
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		System.out.println("Deserialization successfully implemented");
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}

																				}

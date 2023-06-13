package pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Temp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// *Writing object
		
		Employee emp = new Employee(2, "Pawan Kumar", 85000);
		
		FileOutputStream fos = new FileOutputStream("B://employee.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		
		fos.close();
		oos.close();
		
		
		// *Reading object
		
		FileInputStream fis = new FileInputStream("B://employee.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp1 = (Employee) ois.readObject();
		
		System.out.println(emp1);
		
		fis.close();
		ois.close();
		
		
	}

}

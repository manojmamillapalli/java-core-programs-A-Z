package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.Serializable;
class Student implements Serializable
{
	String name;
	String address;
	Student(String name, String address)
	{
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString()
	{
		return "Student [name=" +name+",address="+address+"]";
		
	}

}
public class serializationDemo {

	public static void main(String[] args) throws IOException {
		Student s=new Student("manoj", "tirupati");
//		s.name="Manoj";
//		s.address="tirupati";
		FileOutputStream f=new FileOutputStream("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.txt");
        ObjectOutputStream fobj=new ObjectOutputStream(f);
        fobj.writeObject(s);
        fobj.close();
		
	}


	}

package fileHandling;

import java.util.*;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
FileInputStream fin=new FileInputStream("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.txt");
ObjectInputStream fobj=new ObjectInputStream(fin);

Student s = (Student)fobj.readObject();
System.out.println(s);
fin.close();
fobj.close();
}

}

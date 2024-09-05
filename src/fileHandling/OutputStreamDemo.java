package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputStreamDemo {

	public static void main(String[] args)  {
		//FileInputStream i=new FileInputStream("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.java");
		File f=new File("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.java");
		String s="manoj naidu mamillapalli";
		byte[] b=s.getBytes();
		 try (FileOutputStream fos = new FileOutputStream("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.java", true)) {
	            fos.write(b);
	           // fos.close();
	            System.out.println("Data written to file successfully.");
		 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
	}

}

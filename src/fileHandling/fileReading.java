package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class fileReading {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.java");
//		byte[] b=f.readAllBytes();
//		
//			String content = new String(b);
//		System.out.println(content);
		int n=f.read();
		while(n!=-1)
		{
			char c=(char)n;
			System.out.print(c);
			n=f.read();
		}

	}
	//serialization and deserialization concepts

}

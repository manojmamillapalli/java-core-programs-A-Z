package fileHandling;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriting {

	public static void main(String[] args) throws IOException {
		File f=new File("C://Users//Manoj Naidu//Downloads//filehandling//filedemo.java");
		FileWriter fw=new FileWriter(f);
		if(f.canWrite())
		{
			//fw.append('m');
			fw.write("manoj naidu");
			fw.append("manoj naidu");
		}
		else
		{
			System.out.println("we cannot write into the file");
		}
	fw.close();

	}

}
